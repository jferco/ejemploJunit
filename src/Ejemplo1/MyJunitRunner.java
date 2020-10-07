package Ejemplo1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyJunitRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyJunit.class);
		
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		
		System.out.println("Resultado = " + result.wasSuccessful());
	}

}
