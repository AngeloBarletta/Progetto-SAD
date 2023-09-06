const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
  //res.setHeader('Access-Control-Allow-Origin', '*');
  
  if (req.method === 'POST') {
    let body = '';
    
    req.on('data', chunk => {
      // Ricevi i dati del file inviato
      body += chunk;
    });
    
    req.on('end', () => {
      try {
        const jsonData = JSON.parse(body);
        // Salva i dati del file su disco
        let fileName = jsonData.name;
        let path = './tests/' + fileName;
        fs.writeFile(path, jsonData.code, (err) => {
          if (err) {
            console.error(err);
            res.statusCode = 500;
            res.end('Errore durante il salvataggio del file.');
          } else {
            const htmlContent = fs.readFileSync('./coverage/index.html', 'utf-8');
            const xmlContent = fs.readFileSync('./coverage/jacoco.xml', 'utf-8');

            const combinedData = {
              error: false,
              outCompile: "Il test ha coperto due righe di codice.",
              coverage: xmlContent,
            };

            res.statusCode = 200;
            res.setHeader('Content-Type', 'application/json');
            res.end(JSON.stringify(combinedData));
          }
        });
      } catch(error){
        console.error('Errore nel parsing del JSON:', error);
        res.statusCode = 400; // Bad Request
        res.end('Errore nel parsing del JSON.');
      }
    });
  } else if (req.method === 'OPTIONS') {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'POST');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
    res.setHeader('Access-Control-Max-Age', '86400'); // Durata massima della risposta preflight in secondi (24 ore)
    res.statusCode = 204; // No Content
    res.end();
  } else {
    res.statusCode = 404;
    res.end('Endpoint non valido.');
  }
});

const port = 3001;
server.listen(port, () => {
  console.log(`Server in ascolto sulla porta ${port}`);
});
