package G8.T6.EditorApp.Model;

public class Partita {
    private Long IdGiocatore;
    private Long IdPartita;
    private String NomeClasse;
    private String CodiceClasse;
    private Long IdRobot;               //ha probabilmente lo stesso significato di robot, quindi potremmo cancellarlo
    private String CodiceTest;

    //aggiungo livello e robot, queste informazioni servono per il confronto della coverage
    private Long Livello;
    private String Robot;
    private String CoverageMethod;

    public Partita(){

    }

    public Partita(Long idGiocatore, Long idPartita, String nomeClasse, String codiceClasse, Long idRobot, String codiceTest, Long livello, String robot, String coverageMethod) {
        IdGiocatore = idGiocatore;
        NomeClasse = nomeClasse;
        CodiceClasse = codiceClasse;
        IdRobot = idRobot;
        IdPartita = idPartita;
        CodiceTest = codiceTest;
        Livello = livello;
        Robot = robot;
        CoverageMethod = coverageMethod;
    }

    public Long getIdGiocatore() {
        return IdGiocatore;
    }

    public void setIdGiocatore(Long idGiocatore) {
        IdGiocatore = idGiocatore;
    }

    public String getNomeClasse() {
        return NomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        NomeClasse = nomeClasse;
    }

    public String getCodiceClasse() {
        return CodiceClasse;
    }

    public void setCodiceClasse(String codiceClasse) {
        CodiceClasse = codiceClasse;
    }

    public Long getIdRobot() {
        return IdRobot;
    }

    public void setIdRobot(Long idRobot) {
        IdRobot = idRobot;
    }

    public Long getIdPartita() {
        return IdPartita;
    }

    public void setIdPartita(Long idPartita) {
        IdPartita = idPartita;
    }

    public String getCodiceTest() {
        return CodiceTest;
    }

    public void setCodiceTest(String codiceTest) {
        CodiceTest = codiceTest;
    }

    public Long getLivello() {
        return Livello;
    }

    public void setLivello(Long livello) {
        Livello = livello;
    }

    public String getRobot() {
        return Robot;
    }

    public void setRobot(String robot) {
        Robot = robot;
    }

    public String getCoverageMethod() {
        return CoverageMethod;
    }

    public void setCoverageMethod(String coverageMethod) {
        CoverageMethod = coverageMethod;
    }
    
}


