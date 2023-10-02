import React from "react";

const OutputNull = ({}) => {
  return (
    <>
      <h1 className="font-bold text-xl bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-700 mb-2">
        Output
      </h1>
      <div className="w-full h-56 bg-[#1e293b] rounded-md text-white font-normal text-sm overflow-y-auto">
      </div>
    </>
  ); 
}

const OutputCoverage = ({ outputString }) => {
  // Sostituisci i caratteri di ritorno a capo con tag <br>
  const formattedOutput = outputString.replace(/\n/g, "<br>");

  return (
    <>
      <h1 className="font-bold text-xl bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-700 mb-2">
        Output
      </h1>
      <div
        className="w-full h-56 bg-[#1e293b] rounded-md text-white font-normal text-sm overflow-y-auto"
        dangerouslySetInnerHTML={{ __html: formattedOutput }}
      ></div>
    </>
  );
};


const OutputWindow = ({outputString, coverageDisplay}) => {
  if (!coverageDisplay) {
      return <OutputNull  />;
  }
  /*/ restituiamo la coverage come pagina html
  else
  {
      return <CoverageWindow url={url} code={code}/>;
  } //*/
  // restituiamo la coverage all'interno dell'editor
  else
  {
      return <OutputCoverage outputString={outputString}/>;
  } //*/
};

export default OutputWindow;
