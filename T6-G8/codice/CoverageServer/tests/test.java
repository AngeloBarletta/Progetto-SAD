import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest{
@After
public void tearDown(){

}

@AfterClass
public static void tearDownClass(){

}

@Before
public void setUp(){

}

@BeforeClass
public static void setUpClass(){

}

@Test
public void test(){
    assertEquals(2,1+1);
}
