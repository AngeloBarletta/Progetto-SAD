# Usiamo l'immagine ufficiale di Node.js
FROM node:latest

# Impostiamo la directory di lavoro
WORKDIR /app

# Copiamo i file del progetto nella directory /app del container
COPY tests /app/tests
COPY TestsServer.js /app/TestsServer.js

# Esponiamo la porta 3003
EXPOSE 3003

# Avviamo l'applicazione
CMD ["node", "TestsServer.js"]
