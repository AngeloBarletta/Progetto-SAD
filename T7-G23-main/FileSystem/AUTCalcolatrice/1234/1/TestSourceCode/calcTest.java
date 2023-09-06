package TestPackage;

import static org.junit.Assert.assertEquals; //junit 4

import org.junit.Before; //junit 4
import org.junit.Test; //junit 4

public class calcTest { //junit 4
	
	calcolatrice calc;
	
	@Before //junit 4
	public void setUp() { //junit 4
		calc = new calcolatrice();
	}
	
	@Test
	public void testAdd() { //junit 4
		assertEquals("moltiplicazione funziona", 10, calc.add(5,5)); //junit 4
	}
	
	@Test
	public void testMult() { //junit 4
		assertEquals("moltiplicazione funziona", 20, calc.multiply(4,5)); //junit 4
	}
	
}
