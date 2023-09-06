# Usiamo l'immagine ufficiale di Node.js
FROM node:latest

# Impostiamo la directory di lavoro
WORKDIR /app

# Copiamo i file del progetto nella directory /app del container
COPY classes /app/classes
COPY ClassServer.js /app/ClassServer.js

# Esponiamo la porta 3002
EXPOSE 3002

# Avviamo l'applicazione
CMD ["node", "ClassServer.js"]
