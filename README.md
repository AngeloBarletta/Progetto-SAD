# Progetto-SAD
![Compiling](https://github.com/AngeloBarletta/Progetto-SAD/assets/93767483/2172fe12-be07-4d8c-bae9-3045dddded41)

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
- Per aggiungere ai test Randoop le misure di coverage valutate con EvoSuite è necessario recarsi nel container evosuite_server ed eseguire lo script python: `/app/utente/randoop_coverage.py`
- Per avviare la generazione automatica dei test EvoSuite per tutte le classi del repository, recarsi nel terminale del container evosuite-server ed eseguire lo script: `/app/robot/evosuite_test_script.sh`
- Nel caso in cui si invece voglia lanciare la generazione dei test EvoSuite per una specifica classe è possibile eseguire all’interno del container evosuite-server il seguente comando: 
```sh
CLASS_NAME=<nomeclasse>
./robot_generazione.sh $CLASS_NAME ${CLASS_NAME}SourceCode /repository/${CLASS_NAME}/${CLASS_NAME}SourceCode <numero livelli>
```
