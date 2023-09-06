# Usiamo l'immagine ufficiale di Node.js
FROM node:latest

# Impostiamo la directory di lavoro
WORKDIR /app

# Copiamo i file del progetto nella directory /app del container
COPY coverage /app/coverage
COPY tests /app/tests
COPY CoverageServer.js /app/CoverageServer.js

# Esponiamo la porta 3001
EXPOSE 3001

# Avviamo l'applicazione
CMD ["node", "CoverageServer.js"]
