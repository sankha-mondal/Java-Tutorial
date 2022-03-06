package com.try_catch;

class UnderAgeException extends RuntimeException {
	
	UnderAgeException() {
	}
	UnderAgeException(String msg) {
		super(msg);
	}
}


public class User_Define_Unchecked_Ex {
	public static void main(String[] args) {
		
		int age = 16;
		if(age<18) {
			throw new UnderAgeException("Not elligible for vote");
		}
		else {
			System.out.println("Elligible for vote");
		}
		
	}
}
