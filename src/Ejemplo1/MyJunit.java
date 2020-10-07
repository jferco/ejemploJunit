package Ejemplo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyJunit {
	
	@Test
	public void setup() {
		String s1 = "Hola a todos estamos acá";
		assertEquals ("Hola a todos estamos acá",s1);
	}

}
