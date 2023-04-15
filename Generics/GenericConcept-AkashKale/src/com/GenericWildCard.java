package com;

import java.util.HashSet;
import java.util.Set;

class Abc {
	void display1(Set<Integer> ss) {			// integer 
		
	}
	void display2(Set<String> ss) {			// string 
		
	}
	void display3(Set<?> ss) {		// raw type 
		
	}
	void display4(Set<? extends Number> ss) {		// it can take any set which contains sub class of Number. 
													// sub class of number 
	}
	void display5(Set<? super String> ss) {		// it can take any set which contains String are super class of String. 
													// string as well as super class string. 
	}
}
public class GenericWildCard {
	public static void main(String[] args) {
	Abc obj1 = new Abc();
	Set<Integer> s1 = new HashSet<>(); 
	s1.add(10);	
	obj1.display1(s1);
	
	Set<String> s2 = new HashSet<>();
	s2.add("Ravi");
	
	Set<Double> s3 = new HashSet<>(); 
	s3.add(10.10);	
	
	
	obj1.display2(s2);
	obj1.display3(s1);
	obj1.display2(s2);
	
	obj1.display4(s1);
	obj1.display4(s3);
	
	obj1.display5(s2);
	
	}

}
