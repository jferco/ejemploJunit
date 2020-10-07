package Ejemplo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	String s1 = "Que chiva que es QA";
	
	Message m = new Message(s1);
	
	
	@Test
	public void testPrintMessage() {
		s1 = "Que aburrido que es QA";
		assertEquals(s1, m.printMessage());
	}

}
