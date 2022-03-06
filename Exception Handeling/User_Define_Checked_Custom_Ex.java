package com.try_catch;

class UnderAgeException extends Exception {
	
	 UnderAgeException() {
	}
	 UnderAgeException(String msg) {
		 super(msg);
	 }
}

public class User_Define_Checked_Ex {
	public static void main(String[] args) throws UnderAgeException {

			int age = 16;
			if(age<18) {
				throw new UnderAgeException("Not elligible for vote");
			}
			else {
				System.out.println("Elligible for vote");
			}		
	}
}
