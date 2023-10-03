const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
  //res.setHeader('Access-Control-Allow-Origin', '*');
  
  if (req.method === 'GET') {
    // Gestione della richiesta GET
    fs.readFile('./classes/ClassTest.java', 'utf8', (err, data) => {
      if (err) {
        console.error(err);
        res.statusCode = 500;
        res.end('Errore durante la lettura del file.');
      } else {
        const combinedData = {
          idGiocatore: 1,
          idPartita: 1,
          nomeClasse: "ClassUnderTest.java",
          codiceClasse: data,
          idRobot: 1,
          codiceTest: "",
          livello: 1,
          robot: "EvoSuite",
          coverageMethod: "JaCoCo"
        };

        res.statusCode = 200;
        res.setHeader('Content-Type', 'application/json');
        res.end(JSON.stringify(combinedData));
      }
    });

  } else if (req.method === 'OPTIONS') {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
    res.setHeader('Access-Control-Max-Age', '86400'); // Durata massima della risposta preflight in secondi (24 ore)
    res.statusCode = 204; // No Content
    res.end();
  } else {
    res.statusCode = 404;
    res.end('Endpoint non valido.');
  }
});

const port = 3002;
server.listen(port, () => {
  console.log(`Server in ascolto sulla porta ${port}`);
});
