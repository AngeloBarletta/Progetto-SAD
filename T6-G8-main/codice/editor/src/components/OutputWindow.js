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

const OutputCoverage = ({outputString}) => {
  /*class MyComponent extends React.Component {  render() {    
    // HTML da parsare    
    //const html = '<div><h1>Title</h1><p>Paragraph</p></div>';    
    // Effettua il parsing dell'HTML in componenti React    
    const parsedHTML = parse(html);    
    return <div>{parsedHTML}</div>;  }}*/
    //var myDiv = document.getElementById("output");
    //myDiv.innerHTML = outputString;
    return (
      <>
        <h1 className="font-bold text-xl bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-700 mb-2">
            Output
        </h1>
        <div className="w-full h-56 bg-[#1e293b] rounded-md text-white font-normal text-sm overflow-y-auto"
        dangerouslySetInnerHTML={{ __html: outputString }}></div>
      </>
    );
  /*return (
    <>
      <h1 className="font-bold text-xl bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-700 mb-2">
          Output
      </h1>
      <div className="w-full h-56 bg-[#1e293b] rounded-md text-white font-normal text-sm overflow-y-auto"
      dangerouslySetInnerHTML={{ __html: html }}></div>
    </>
    );//*/
}


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
