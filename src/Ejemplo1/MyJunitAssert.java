package Ejemplo1;

import static org.junit.Assert.*;


import org.junit.Test;

public class MyJunitAssert {
	
	@Test
	public void testAssertions() {
		
		String s1 = new String ("Junit");
		String s2 = new String ("Junit");
		String s3 = null;
		String s4 = "Jose";
		String s5 = "Jose";
		
		int v1 = 5;
		int v2 = 7;
		
		String[] a1 = {"uno", "dos", "tres"};
		String[] a2 = {"uno", "dos", "tres"};
		
		//Objetos son iguales
		assertEquals(s1,s2);
		//true
		assertTrue(v1<v2);
		
		//false
		assertFalse(v1>v2);
		//not null
		
		assertNotNull(s1);
		//null
		assertNull(s3);
		
		//mismo objeto
			
		assertSame(s4,s5);
		
		//differente objeto
		
		assertNotSame(s1,s2);
		//array
		
		assertArrayEquals(a1, a2);
		
		
		
	}

}
