package com.try_catch;

public class Implement_of_Throw {
	public static void main(String[] args) {

		try {
			int res = 20/0;
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			throw new ArithmeticException("Own Created Exception i.e custom exception");
		}
		
		
		
	}
}
