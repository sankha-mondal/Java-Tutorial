package com.try_catch;

public class Multiple_Catch_Block {
	public static void main(String[] args) {
		
		try {
			int[] arr = new int[] {10,20,30,40,50};
			int res = arr[2]/0;
			System.out.println("try block ends here");
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero not possible: " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't access elements out side of array: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Another exception: "+e.getMessage());
		}
	}

}
