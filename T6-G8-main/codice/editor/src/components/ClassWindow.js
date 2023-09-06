//import React from "react";

import React, { useState } from "react";

import Editor from "@monaco-editor/react";

//import * as monaco from 'monaco-editor/esm/vs/editor/editor.api';

const ClassEditor = ({code, language, theme, editorDidMount}) => {
  return (
  <div id="Class-Window" className="overlay rounded-md overflow-hidden w-full h-full shadow-4xl">
    <Editor 
        height="50vh"
        width={`100%`}
        language={language}
        value={code}
        theme={theme}
        defaultValue=""
        options={{readOnly: true}} // rendiamo la classe da testare non modificabile
        onMount={editorDidMount}
    />
  </div>
  );
};

const ClassEditorCoverage = ({code, language, theme, editorDidMount}) => {
return (
<div id="Class-Window" className="overlay rounded-md overflow-hidden w-full h-full shadow-4xl">
  <Editor 
      height="50vh"
      width={`100%`}
      language={language}
      value={code}
      //path={value}
      theme={theme}
      defaultValue="// some comment"
      options={{readOnly: true}} // rendiamo la classe da testare non modificabile
      onMount={editorDidMount} // applichiamo le decorations
  />
</div>
);
};

const CoverageWindow = ({code, url}) => {
  /*/ restituisce la coverage da request html
  return (
  <div id="Coverage-Window" className="overlay rounded-md overflow-hidden w-full h-full shadow-4xl"> 
    <iframe srcdoc={code} height={380} width={570}> 
    </iframe>
  </div>
  ); //*/

  // restituisce la coverage da url
  return (
    <div id="Coverage-Window" className="overlay rounded-md overflow-hidden w-full h-full shadow-4xl"> 
      <iframe src={url} height={380} width={570}> 
      </iframe>
    </div>
    ); //*/
};

const ClassWindow = ({coverageDisplay, code, language, url, theme, editorDidMount, editorDidMountE}) => {
  if (!coverageDisplay) {
      return <ClassEditor theme={theme} code={code} language={language} editorDidMount={editorDidMountE}/>;
  }
  /*/ restituiamo la coverage come pagina html
  else
  {
      return <CoverageWindow url={url} code={code}/>;
  } //*/
  // restituiamo la coverage all'interno dell'editor
  else
  {
      return <ClassEditorCoverage theme={theme} code={code} language={language} editorDidMount={editorDidMount}/>;
  } //*/
};

export default ClassWindow;
