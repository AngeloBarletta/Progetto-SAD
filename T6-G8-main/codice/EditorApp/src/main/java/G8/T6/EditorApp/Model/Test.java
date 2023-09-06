package G8.T6.EditorApp.Model;

public class Test {
    private String Name;
    private String Code;
    private Long IdGiocatore;
    private Long IdPartita;
    private String NomeClasse;
    private String CodiceClasse;
    private Long IdRobot;

    public Test(){

    }

    public Test(String name, String code, Long idGiocatore, Long idPartita, String nomeClasse, String codiceClasse, Long idRobot){
        Name = name;
        Code = code;
        IdGiocatore = idGiocatore;
        NomeClasse = nomeClasse;
        CodiceClasse = codiceClasse;
        IdRobot = idRobot;
        IdPartita = idPartita;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
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
}
