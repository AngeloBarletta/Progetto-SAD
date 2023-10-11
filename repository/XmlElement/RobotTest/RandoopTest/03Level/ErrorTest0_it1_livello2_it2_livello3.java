
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    xmlElement5.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    boolean b13 = xmlElement5.addElement(xmlElement10);
    boolean b14 = xmlElement0.addElement(xmlElement5);
    int i15 = xmlElement0.count();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    XmlElement xmlElement17 = xmlElement0.getElement("hi!");

  }

}
