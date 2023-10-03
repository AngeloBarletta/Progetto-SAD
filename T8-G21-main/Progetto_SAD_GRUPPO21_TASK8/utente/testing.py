import requests
import json

data = {
    "underTestClassName": "ClassUnderTest.java",
    "underTestClassCode": """ 
public class ClassUnderTest {
    public int add(int a, int b) {
        return a + b;
    }
}
    """,
    "testingClassName": "AppTest.java",
    "testingClassCode": """
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
    @Test
    public void test(){
        ClassUnderTest cut = new ClassUnderTest();
        assertEquals(2,cut.add(1,1));
    }
}
    """
}

URL = "http://localhost:5000/evosuite_coverage"

x = requests.post(URL, json = data).text
res = json.loads(x)
print(json.dumps(res, indent=4))