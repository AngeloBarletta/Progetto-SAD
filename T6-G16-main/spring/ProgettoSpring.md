# Configurazione Progetto Spring

### Creazione del progetto
- con il Packaging JAR all'interno del file sarà presente anche una versione embedded del server Tomcat che permette di eseguire l'applicazione senza dover installare alcun server, con il package WAR si può deployare con un server diverso -> si può cambiare dal file pom.xml
- le Dipendenze vengono messe a disposizione da spring, sono dei microframework focalizzati su specifiche features. 
  -  Spring Boot Dev Tools: permette di non dover riavviare l'applicazione ogni qualvolta andiamo ad effetturare una modifica al codice
  -  Spring Web: permette di gestire il pattern MVC e soprattutto permette di creare delle API RESTful
  -  Sono presenti dependencies per la sicurezza o i driver per interfacciarsi con i database, per il testing, per il cloud

Dal sito https://start.spring.io/:

<img width="1374" alt="Screenshot 2023-06-08 alle 10 32 04" src="https://github.com/martasichinolfi/spring/assets/101711376/96fd44fa-55d7-49a2-a5bc-94a6601c635d">


Premendo su GENERATE viene creata la cartella con il progetto spring

### Packages e file
- La struttura del progetto è quella di progetto MAVEN:
  - Package __java/com/task6/editor__ che contiene la classe EditorApplication.java. Questa classe è l'entry point dell'applicazione ed è annotata con @SpringBootApplication, questo fa capire a SpringBoot di che tipo di classe si tratta e come deve essere gestita
  - Package __test/java/com/task6/editor__: package dedicato ai test
  - All'interno degli altri sorgenti troviamo il file ##application.properties## (in resources) che verrà  utilizzato per inserire tutte le impostazioni del progetto, come ad esempio la modifica del numero di porta associato all'applicazione a tutte le impostazioni relative alla sicurezza, connessione database, ecc
  - È presente il file __pom.xml__ che ci permette di gestire tutte le versioni delle varie dipendenze, nel nostro caso sono presenti: spring-boot-starter-web, spring-boot-devtools, spring-boot-starter-test, spring-boot-maven-plugin. Esso contiene la versione di SpringBoot utilizzata, i dati relativi al groupId, all'artifact, la versione (che può essere modificata). Questo file pom può essere modificato manualemente se vogliamo aggiungere altre dipendenze o plugin o modificare parametri.

### RUN
Per lanciare il progetto su VSCode, 
- scaricare la seguente estensione: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-boot-dashboard
- aprire la dashboard dal VSCode e fare run 
<img width="1381" alt="Screenshot 2023-06-08 alle 10 29 01" src="https://github.com/martasichinolfi/spring/assets/101711376/b4d09031-0dec-4aee-b947-62d07d35019b">

Notiamo che una volta fatto il RUN è partita un'istanza di Tomcat sulla porta 8080 (che è quella di default). Questa porta potrebbe andare in conflitto con altre applicazioni già in esecuzione, in questo caso da application.properties è possibile specificare una porta diversa.

# Struttura Progetto Spring
Un progetto è tipicamente organizzato in una serie di cartelle che vengono create direttamente dai tool:
- La cartella __src/main/java__: contiene tutto il codice sorgente che sarà organizzato nei diversi package
- La cartella __src/test/java__: contiene tutto il codice relativo ai test
- La cartella __src/main/resources__: contiene le risorse utilizzate all'interno dell'applicazione. 
  - Tra queste abbiamo il file _application.properties_ e serve per inserire tutte le proprietà del codice sorgente scritte nella forma _proprietà:valore_ (oppure si può usare l'_application.yaml_).
- File __pom.xml__: file che viene generato automaticamente in partenza e contiene tutte le dipendenze, ad ognuna di esse corrisponde un blocco _<dependency>_. In questo modo Maven saprà come scaricare le dipendenze e come inserirle nel progetto.
  
- Le classi che vengono create automaticamente sono:
  - __EditorApplication.java__: class principale dotata del metodo _main_ che va a richiamare il metodo _run()_ di SpringApplication a cui viene passato il nome della classe e gli eventuali argomenti passati da riga di comando. Questa classe è annotata come _@SpringBootApplication_, si tratta di una notazione specifica di SpringBoot che fonde tre annotazioni del frameworok Spring (@Configuration, @ComponentScan, @EnableAutoConfiguration). Quindi con una sola annotazioe si denota questa classe come:
    - @Configuration:una classe di configurazione 
    - @ComponentScan: si attiva il ComponentScan ossia SpringBoot nel momento in cui si avvia l'applicazione va a ricercare tutte le classi che sono annotate con @Component e con altre annotazioni (chiamate stereotipi, come @Controller, @RESTController, @Repository, @Service, ecc) in modo tale da creare dei __Bean__. Questi ultimi sono delle istanze delle classi da gestire all'interno dell'ApplicationContext e da utilizzare in combinazione con la dependency injection laddove siano richieste dipendenze all'interno delle classi.
    - @EnableAutoConfiguration: si attiva la possibilità di avere delle configurazioni di default associate ai vari moduli che si vanno ad utilizzare che ci consentono di avere un'applicazione funzionante con delle impostazioni di default che possono poi essere modificate.
  
(La classe EditorApplication non viene modificata, tutto il codice verrà inserito negli altri package.)
  
- __EditorApplicationTests.java__: questa classe riguarda i test, si trova nella cartella __src/java__. Questa classe è un esempio di classe che può essere utilizzata per creare i test. È presente l'annotazione _@SpringBootTest_ che va utilizzata quando si fanno dei test di integrazione. Questo perchè SpringBootTest carica l'intero ApplicationContext, quindi tutti i Bean dell'applicazione, indipendentemente dal fatto che stiamo facendo un test di unità (test di un singolo componente).
  - Il meotodo _contextLoads()_ è annotato con _@Test_, tutti i metodi che corrispondono ai test vanno annotati in questo modo affinchè vengano presi in considerazione durante la fase di test.
  
# Creazione Progetto Spring da VSCode
### Estensioni necessarie
Bisogna scaricare le seguenti estensioni:
- __Extension Pack for Java__ (https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack): ci permette di abilitare una serie di funzionalità che riguardano la navigazione del codice, la funzionalità di IntelliSense, il debugging, il testing, il supporto per Maven/Gradle, ecc.
- __Spring Boot Extension Pack__ (https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack): insieme di estensioni per sviluppare applicazioni basate su Spring Boot. In questo modo abbiamo sia il supporto per Spring Inizializr (quindi possiamo creare direttamente da VSCode. Vi è poi la possibilità di gestire le applicazioni attraverso una SpringBoot Dashboard con cui possiamo avviare, fermare, mandare in debug, ecc. Permette anche di poter lavorare con i file di configurazione (application.properties) 
  
### Creazione progetto da zero
1. Premere _ctrl + shift + P_ (su mac: _cmd + shift + P_) e scrivere _spring_
2. Selezionare _Spring Inizializr: Create a Maven Project..._
3. Selezionare la versione: _3.1.0_
4. Selezionare il linguaggio: _java_
5. Inserire il nome: _com.taskt6_
6. Inserire il nome dell'artifact: _editor_
7. Selezionare il tipo di packaging: _jar_
8. Specificare la versione di java: _20_
9. Inserire le dipendenze: _Spring Web_, _Spring Boot Dev Tools_
10. Selezionare la cartella dove salvare il progetto
  
### Dashboard Spring
La dashboard ci consente di accedere all'applicazione ed è attivabile dal pulsanete _Spring Boot Dashboard_:
<img width="1374" alt="Screenshot 2023-06-08 alle 16 21 36" src="https://github.com/martasichinolfi/spring/assets/101711376/eb99a37d-c520-45b4-8980-f701947157e4">
  
Vediamo tre sezioni che sono:
  - La lista delle APPS
  - I BEANS
  - Gli ENDPOINTS MAPPING (all'inizio vuoto perché non ci sono Controller)
  
 Per far partire l'applicazione premiamo sull'app (editor) e facciamo il RUN

# Creazione di un Controller 
Bisogna creare all'interno della cartella _src/main/java_ la classe _EditorController.java_. All'interno della classe controller, bisogna definire i metodi che gestiscono le richieste relative all'applicazione HTML e ai file JavaScript. 

