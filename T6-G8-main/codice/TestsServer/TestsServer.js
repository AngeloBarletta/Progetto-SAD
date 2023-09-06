const http = require('http'); // abilitiamo i messaggi http
const fs = require('fs'); // abilitiamo l'accesso al file system locale

const server = http.createServer((req, res) => { // req è il messaggio di richiesta, res è il messaggio di risposta
  //res.setHeader('Access-Control-Allow-Origin', '*'); // permette l'accesso al server
  
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
            res.statusCode = 200;
            res.end('File salvato correttamente.');
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

const port = 3003;
server.listen(port, () => {
  console.log(`Server in ascolto sulla porta ${port}`);
});
