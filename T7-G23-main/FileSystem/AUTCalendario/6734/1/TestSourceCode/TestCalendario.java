package TestPackage;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;
 
@RunWith(Theories.class)
public class TestCalendario {
 
  @DataPoints("giorni")
  public static int[] giorni() {
       return new int[]{
                        -1, 0, 1, 15, 28, 29, 30, 31, 32};
  }
 
  @DataPoints("mesi")
  public static String[] mesi() {
       return new String[]{
           "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"};
  }
  

  @DataPoints("anni")
  public static int[] anni() {
       return new int[]{
                        1500, 1600, 1700, 2000, 2021};
  }
 
  
  @Theory
  public void dayValid31(@FromDataPoints("giorni") Integer a, @FromDataPoints("mesi") String b, @FromDataPoints("anni") Integer c) {
	  assumeTrue(a>=1 && a<=31 && 
			  (  b.contentEquals("gennaio") || b.contentEquals("marzo") || b.contentEquals("maggio") || b.contentEquals("luglio") || b.contentEquals("agosto") || b.contentEquals("ottobre") || b.contentEquals("dicembre"))
			  && c>=1582);
	  
	  assertFalse(Calendario.calend(a, b, c).contentEquals("Errore"));
  }

  @Theory
  public void dayValid28(@FromDataPoints("giorni") Integer a, @FromDataPoints("mesi") String b, @FromDataPoints("anni") Integer c) {
	  assumeTrue(a>=1 && a<=28 
			  && c>=1582);
	  assertFalse(Calendario.calend(a, b, c).contentEquals("Errore"));
  }

  @Theory
  public void dayValid29(@FromDataPoints("giorni") Integer a, @FromDataPoints("mesi") String b, @FromDataPoints("anni") Integer c) {
	  assumeTrue(a==29 && 
			  ( ! b.contentEquals("febbraio"))
			  && c>=1582);
	  assertFalse(Calendario.calend(a, b, c).contentEquals("Errore"));
  }
  
  @Theory
  public void dayValid29Febbraio(@FromDataPoints("giorni") Integer a, @FromDataPoints("mesi") String b, @FromDataPoints("anni") Integer c) {
	  assumeTrue(a==29 && 
			  ( b.contentEquals("febbraio"))
			  && c>=1582 && bisestile(c));
	  
	  assertFalse(Calendario.calend(a, b, c).contentEquals("Errore"));
  }
  
  @Theory
  public void dayInvalid29Febbraio(@FromDataPoints("giorni") Integer a, @FromDataPoints("mesi") String b, @FromDataPoints("anni") Integer c) {
	  assumeTrue(a==29 && 
			  ( b.contentEquals("febbraio"))
			  && !bisestile(c));
	  
	  assertTrue(Calendario.calend(a, b, c).contentEquals("Errore"));
  }

private boolean bisestile(Integer c) {
	return ((c%4==0 && !(c%100==0)) || (c%400==0));
}
}
