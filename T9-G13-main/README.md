# T9-G13
# Task 9: Requisiti sull'esecuzione del robot Randoop

## Gruppo 13
- Amodio Anna M63001455
- Bramante Salvatore M63001529
- Cataldo Cristian M63001462
- Guarino Stefano M63001447

## Descrizione del task

L’applicazione deve offrire la funzionalità di generazione dei test su una data classe Java usando il Robot Randoop. Tale funzionalità riceverà in input un file di testo (classe da testare), dovrà lanciare il generatore ed esecutore di Test Randoop, restituendo in output il codice di casi di test generati ed i risultati dell’esecuzione. L’esito dell’esecuzione dovrà essere elaborato in maniera da estrarre da essi le informazioni rilevanti ai fini del gioco (ad esempio, la copertura del codice, etc.).

## Versioni
Sono state realizzate due versioni diverse della funzionalità che seguono due algoritmi di generazioni differenti. La versione in questo branch è implementa l'algoritmo originario. L'algoritmo alternativo discusso si trova nel branch `main-versione-2`.

## Guida di Installazione

La seguente guida di utilizzo è relativa all'installazione su un container.

Per installare e integrare su un container docker il servizio è necessario:
1) Effettuare il clone di questa repostitory;
2) Eseguire il file `./startDocker.sh` su Mac o `./startDocker.bat` su Windows passando come argomento il percorso della repository condivisa dove si memorizzano le classi di test.

Se si esegue su linux, è sufficiente seguire i seguenti passi per installare e integrare il servizio:
1) Effettuare il clone del questa repostitory;
2) Eseguire lo script `./install.sh`

A titolo di esempio, abbiamo incluso anche un progetto di esempio che importa il jar creato e inoltra una richiesta di prova per le classi che inizialmente sono presenti nella directory condivisa.
Al fine di eseguire il main di tale progetto è necessario spostarsi all'interno del container nella directory `esempio` ed eseguire i seguenti comandi:

``
mvn compile
``

``
mvn exec:java -Dexec.mainClass="org.example.Main"
``
