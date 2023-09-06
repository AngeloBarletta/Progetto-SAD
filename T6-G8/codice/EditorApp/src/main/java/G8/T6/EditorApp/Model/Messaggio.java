package G8.T6.EditorApp.Model;

public class Messaggio {
    private String msg;

    public Messaggio(){
        
    }

    public Messaggio(String msg){
        this.msg = msg;
    }

    // Getter per l'attributo "msg"
    public String getMsg() {
        return msg;
    }
    // Setter per l'attributo "msg"
    public void setMsg(String msg) {
        this.msg = msg;
    }
}