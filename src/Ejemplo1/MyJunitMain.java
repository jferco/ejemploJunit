package Ejemplo1;

import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyJunitMain {
	@Ignore
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyJunitAssert.class);
		
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		
		System.out.println("Resultado = " + result.wasSuccessful());
	}

}
