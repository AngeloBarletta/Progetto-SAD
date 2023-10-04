# Progetto-SAD
![image](https://github.com/AngeloBarletta/Progetto-SAD/assets/93737876/489f736d-e9f1-457a-8e9d-c413fa6f0272)

## Installazione
L'intera installazione prevede l'utilizzo di docker. Nel caso si utilizzi Windows, fare attenzione all'EOL (End of line) settato da git automaticamente durante il clone: deve essere "LF".

Eseguire questo comando:
```sh
docker compose up --build -d
```

Il frontend sarà accessibile su http://localhost/.

## Aggiunta nuove classi di test
- l’admin deve inserire il file .java nel repository rispettando la struttura del Filesystem specificata in `repository/FolderTree_v1.txt`
- Rilanciare il comando: `docker compose up --build -d`
- I test del robot Randoop saranno automaticamente generati
- Per la generazione dei test EvoSuite, recarsi nel terminale del container evosuite-server
- Recarsi nella cartella `/app/robot`
- Digitare i seguente comandi per la generazione dei test EvoSuite: 
```sh
CLASS_NAME=<nomeclasse>
./robot_generazione.sh $CLASS_NAME ${CLASS_NAME}SourceCode /repository/${CLASS_NAME}/${CLASS_NAME}SourceCode <numero livelli>
```