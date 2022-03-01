package com.try_catch;

public class Try_Catch {
	public static void main(String[] args) {

		try {
			int res = 10/0;
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero not possible: " + e.getMessage());  // Normal
			throw new ArithmeticException("Divide by zero not possible");    // Custom Exception
		}
		
	}

}
