'use strict';

import { snippet as snippetStore, library as libraryStore } from './store';
var CodeMirror = require('codemirror');
var Pos = CodeMirror.Pos;

var defaultSnippets = ['sysout', 'cls'];
var defaultLibraries = [];

var keywords = [
    'abstract', 'assert', 'boolean', 'break', 'byte',
    'case', 'catch', 'char', 'class', 'const', 'continue', 'default',
    'do', 'double', 'else', 'enum', 'extends', 'false', 'final', 'finally',
    'float', 'for', 'goto', 'if', 'implements', 'import', 'instanceof',
    'int', 'interface', 'long', 'native', 'new', 'null', 'package',
    'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp',
    'super', 'switch', 'synchronized', 'this', 'throw', 'throws',
    'transient', 'try', 'true', 'void', 'volatile', 'while'
];

var getToken = function(editor, cursor) {
    var token = editor.getTokenAt(cursor);
    if (token.type === 'variable') {
        
        var tprop = editor.getTokenAt(Pos(cursor.line, token.start));
        if (tprop.string == '.') {
            token.type = 'property';
        }
    }
    return token;
};

var searchSnippet = function(token, snippets, found) {
    for (var snippetName in snippets) {
        if (snippets.hasOwnProperty(snippetName)) {
            if (snippetName.lastIndexOf(token.string, 0) == 0) {
                var snippet = snippets[snippetName];
                snippet.displayText = snippetName;
                snippet.hint = function(editor, completions, data) {
                    var from = Pos(completions.from.line, completions.from.ch);
                    var to = Pos(completions.to.line, completions.to.ch);
                    var matched = /\${}/.exec(data.text);
                    if (matched) {
                        var length = matched.index;
                        var label = data.text.replace(/\${}/g, '');
                        editor.replaceRange(label, from, to);
                        editor.setCursor(Pos(completions.from.line, completions.from.ch + length));
                    } else {
                        editor.replaceRange(data.text, from, to);
                    }
                };
                found.push(snippet);
            }
        }
    }

    return found;
};

var searchKeyword = function(token, found) {
    var matches = keywords.filter(item => item.lastIndexOf(token.string, 0) === 0);
    found.push.apply(found, matches);
    return found;
};

var searchLibrary = function(token, context, libraries, found) {
    for (var packageFullName in libraries) {
        var library = libraries[packageFullName];

        var current = library;

        for (var i = (context || []).length - 1; i >= 0; i--) {
            current = current[context[i].string];
            if (!current || current.__type__ !== 'object') {
                current = null;
            }
        }

        if (current === null) continue;

        for (var propertyName in current) {
            if (current.hasOwnProperty(propertyName) && propertyName.lastIndexOf('__', 0) == -1) {
                if (propertyName.lastIndexOf(token.string, 0) === 0) {
                    var property = current[propertyName];
                    property.text ? found.push(property) : found.push(propertyName);
                }
            }
        }
    }

    return found;
};

var searchAnyword = function(token, cursor, found) {
    var range = 500; 
    var re = /[\w$]+/g;
    var curWord = token.string;
    var editor = this;


    for (var dir = -1; dir <= 1; dir += 2) {
        var line = cursor.line;
        var endLine = Math.min(Math.max(line + dir * range, editor.firstLine()), editor.lastLine()) + dir;
        for (; line != endLine; line += dir) {
            var text = editor.getLine(line);
            var matches;
           
            while (matches = re.exec(text)) {
                var matchedString = matches[0];
                if (line == cursor.line && matchedString === curWord) continue;
                if ((!curWord || matchedString.lastIndexOf(curWord, 0) == 0)
                    && !keywords.includes(matchedString)
                    && !found.includes(matchedString)) {
                    found.push(matchedString);
                }
            }
        }
    }

    return found;
};

var getCompletions = function(token, context, editor, cursor) {
    var found = [];

    if (context && context.length) {
        var className = context.pop().string;
        var grantedLibraries = editor.libraries || defaultLibraries;
        var libraries = libraryStore.search(packageFullName => {
            return packageFullName.endsWith(className) && grantedLibraries.includes(packageFullName);
        });

        if (Object.keys(libraries).length > 0) {
            searchLibrary.call(editor, token, context, libraries, found); 
        } else {
            searchAnyword.call(editor, token, cursor, found);
        }
    } else {
        var grantedSnippets = editor.snippets || defaultSnippets;
        var snippets = snippetStore.search(snippetName => {
            return grantedSnippets.includes(snippetName);
        });
        searchKeyword.call(editor, token, found);
        searchSnippet.call(editor, token, snippets, found); 
        searchAnyword.call(editor, token, cursor, found); 
    }

    return found;
};

CodeMirror.registerHelper('hint', 'addSnippet', function(editor, snippetName, definition) {
    if (!editor.snippets) {
        editor.snippets = Object.assign([], defaultSnippets);
    }

    if (!editor.snippets.includes(snippetName)) {
        editor.snippets.push(snippetName);
    }
});

CodeMirror.registerHelper('hint', 'removeSnippet', function(editor, snippetName) {
    if (editor.snippets) {
        var index = editor.snippets.indexOf(snippetName);
        if (index !== -1) {
            editor.snippets.splice(index, 1);
        }
    }
});

CodeMirror.registerHelper('hint', 'clearSnippet', function(editor) {
    if (editor.snippets) {
        editor.snippets = undefined;
    }
});

CodeMirror.registerHelper('hint', 'addLibrary', function(editor, packageFullName) {
    if (!editor.libraries) {
        editor.libraries = Object.assign([], defaultLibraries);
    }

    if (!editor.libraries.includes(packageFullName)) {
        editor.libraries.push(packageFullName);
    }
});

CodeMirror.registerHelper('hint', 'removeLibrary', function(editor, packageFullName) {
    if (editor.libraries) {
        var index = editor.libraries.indexOf(packageFullName);
        if (index !== -1) {
            editor.libraries.splice(index, 1);
        }
    }
});

CodeMirror.registerHelper('hint', 'clearLibrary', function(editor) {
    if (editor.libraries) {
        editor.libraries = undefined;
    }
});

CodeMirror.registerHelper('hint', 'java', function(editor, options) {
    var cur = editor.getCursor();
    var token = getToken(editor, cur);

    if (/\b(?:string|comment)\b/.test(token.type)) return;

    // token.state = CodeMirror.innerMode(editor.getMode(), token.state).state;

    if (!/^[\w$_]*$/.test(token.string)) {
        token = {
            start: cur.ch,
            end: cur.ch,
            string: '',
            state: token.state,
            type: token.string == '.' ? 'property' : null
        };
    } else if (token.end > cur.ch) {
        
        token.end = cur.ch;
        token.string = token.string.slice(0, cur.ch - token.start);
    }

    var tprop = token;
    var context = [];

    while (tprop.type == 'property') {
        tprop = getToken(editor, Pos(cur.line, tprop.start));
        if (tprop.string != '.') return;
        tprop = getToken(editor, Pos(cur.line, tprop.start));
        context.push(tprop);
    }

    var completions = {
        list: getCompletions(token, context, editor, cur),
        from: Pos(cur.line, token.start),
        to: Pos(cur.line, token.end)
    };

    var $tooltip = null;
    var makeTooltip = function(x, y, content) {
        $tooltip = $('<div class="CodeMirror-definition-tooltip">' + content + '</div>');
        $tooltip.css({ left: x, top: y });
        $tooltip.insertAfter(document.body);
    };
    var removeTooltip = function() {
        $tooltip && $tooltip.remove();
    };

    CodeMirror.on(completions, 'close', removeTooltip);
    CodeMirror.on(completions, 'select', function(completion, node) {
        removeTooltip();

        if (completion.doc) {
            makeTooltip(
                node.parentNode.getBoundingClientRect().right + window.pageXOffset,
                node.getBoundingClientRect().top + window.pageYOffset,
                completion.doc
            );
        }
    });

    return completions;
});
