# Usiamo l'immagine ufficiale di Node.js
FROM node:latest

# Impostiamo la directory di lavoro
WORKDIR /app

# Copiamo i file del progetto nella directory /app del container
# COPY node_modules /app/node_modules
COPY public /app/public
COPY src /app/src
COPY .env.sample /app/.env.sample
COPY .project /app/.project
COPY package.json /app/package.json
COPY package-lock.json /app/package-lock.json
COPY postcss.config.js /app/postcss.config.js
COPY tailwind.config.js /app/tailwind.config.js
COPY yarn.lock	/app/yarn.lock

# Installiamo le dipendenze del progetto
RUN npm install

# Avviamo l'applicazione
CMD ["npm", "start"]
