# Cartelle
- La cartella _spring_ contiene il componente Editor senza integrazione con i task
- La cartella _spring_integration_t5_ contiene il progetto con le modifiche necessarie per integrare il componente con il task T5 (senza Docker)
- La cartella _spring_integration_t7_ contiene il progetto con le modifiche necessarie per integrare il componente con il task T7 (in realtà sono presenti le funzioni _getCoverage()_ e _getErrors()_ che dovevano recuperare rispettamente il file di coverage Jacoco e gli errori di sintassi ma non funzionano le richieste html e quindi questi file ci sono stati inviati dal gruppo G23 e caricati in locale solo per mostrare il funzionamento dei bottoni run e compile nel progetto _spring_)

# Interazioni
- T5 - G5: caricamento nell'editor "Class To Test" della classe da testare scelta dall'utente
- T1 - G20: database delle classi
- T7 - G23: prototipo funzioni run e compile tramite i file da loro realizzati (non c'è il collegamento sul server)

# Esecuzione
1. Per eseguire la cartella contenente solo il progetto _spring_ è necessario avere la versione JAVA JDK-20 e poi eseguire il progetto Spring chiamato __editor__
2. Per eseguire la cartella _spring_integration_t5_ è necessario aprire la cartella completa dei progetti dei gruppi T1-G20 e T5-G5 (non presenti su questa repository per limiti di spazio) ed inserire anche la cartella _spring_integration_t5_. Bisogna quindi eseguire il progetto Spring __classut_repo__ (T1-G20) ed il progetto Spring __studentsystem__ (T5-G5). Successivamente è neccesario eseguire il progetto __editor__ (T6-G16)
    - NB: per poter visualizzare le classi è necessario caricare delle classi java tramite il file __upload.html__ presente nella cartella _progetto/classi/T1-G20/upload.html_

# Docker
1. Far partire il server Docker
2. Entrare da terminale nella cartella _editor_ 
3. Fare il build in un container del progetto jar con il seguente comando: _docker build . -t editor:1.0_
    - NB: La versione JDK utilizzata per creare il file eseguibile jar è JDK-20 
5. Quindi eseguire il progetto sul container Docker con il seguente comando: _docker run -p 8080:8080 editor:1.0_
