package G8.T6.EditorApp.Model;

public class Partita {
    private Long IdGiocatore;
    private Long IdPartita;
    private String NomeClasse;
    private String CodiceClasse;
    private Long IdRobot;
    private String CodiceTest;

    public Partita(){

    }

    public Partita(Long idGiocatore, Long idPartita, String nomeClasse, String codiceClasse, Long idRobot, String codiceTest) {
        IdGiocatore = idGiocatore;
        NomeClasse = nomeClasse;
        CodiceClasse = codiceClasse;
        IdRobot = idRobot;
        IdPartita = idPartita;
        CodiceTest = codiceTest; 
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
}
