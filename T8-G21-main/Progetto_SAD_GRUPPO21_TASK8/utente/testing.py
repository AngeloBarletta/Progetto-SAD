import requests

data = {
    "underTestClassName": "ClassUnderTest",
    "underTestClassCode": """ 
package mypackage;

public class ClassUnderTest {
    public int add(int a, int b) {
        return a + b;
    }
}
    """,
    "testingClassName": "AppTest",
    "testingClassCode": """
package mypackage;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
    @Test
    public void test(){
        ClassUnderTest cut = new ClassUnderTest();
        assertEquals(2,cut.add(2,2));
    }
}
    """
}

URL = "http://localhost:5000/evosuite_coverage"

x = requests.post(URL, json = data).text
print(x)