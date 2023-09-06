import React, { useState } from "react";

import Editor from "@monaco-editor/react";

const CodeEditorWindow = ({ onChange, language, code, theme }) => {
  const [value, setValue] = useState(code || "");

  
  const handleEditorChange = (value) => {
    setValue(value);
    onChange("code", value);
  };

  const options = {
    readOnly: false,
    autoClosingBrackets: 'always',
    autoIndent: 'full',
    inlineSuggest:   {
   enabled: true,
   /**
    * Configures the mode.
    * Use `prefix` to only show ghost text if the text to replace is a prefix of the suggestion text.
    * Use `subword` to only show ghost text if the replace text is a subword of the suggestion text.
    * Use `subwordSmart` to only show ghost text if the replace text is a subword of the suggestion text, but the subword must start after the cursor position.
    * Defaults to `prefix`.
   */
   mode: 'prefix',
   showToolbar: 'always'
   
  },
  "bracketPairColorization.enabled": true,
  matchBrackets: 'always',
  contextmenu: true,
  selectOnLineNumbers: true,
  roundedSelection: false,
  lightbulb: {enabled:true},
  contextmenu: true,
  minimap: {
    enabled: true,
  },
  automaticLayout: true,
  find:{
    cursorMoveOnType: true,
    seedSearchStringFromSelection:  'always',
    autoFindInSelection: 'multiline',
    loop: true
  }
  
  
  };

  return (
    <div className="overlay rounded-md overflow-hidden w-full h-full shadow-4xl">
      <Editor
        height="85vh"
        width={`100%`}
        language={language || "javascript"}
        value={value}
        theme={theme}
        options={options}
        defaultValue="// some comment"
        onChange={handleEditorChange}
      />
    </div>
  );
};
export default CodeEditorWindow;
