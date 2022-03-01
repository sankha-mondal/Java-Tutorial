package com.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_all_Operation {
	public static void main(String[] args) {

		System.out.println("Declaration of HashSet Object:");
		
		HashSet<String> car = new HashSet<String>();
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("HashSet add() method: To add list elements");
		    car.add("Volvo");
		    car.add("BMW");
		    car.add("Ford");                        //  To add list elements  						//  add()
		    car.add("Mazda");
		    System.out.println(car);
		    
		    System.out.println("\nHashSet Elements: ");
			Iterator<String> it = car.iterator();	//  Converting to Iterator
			while(it.hasNext()) {
				System.out.print(it.next() + " ");      //  To print list elements
			}
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("HashSet contains() method: To detect present or not");
		boolean ans = car.contains("BMW");								//  contains()
		System.out.println(ans);
			
System.out.println("\n------------------------------------------------------------------");			
			
		System.out.println("\nArrayList remove() method: To remove particular element");
		car.remove(0);										//  remove()
		System.out.println(car);
			
System.out.println("\n------------------------------------------------------------------");

		System.out.println("\nArrayList size() method: To find out how many items there are");	
		System.out.println("Length of HashSet: " + car.size());	  					//  size()
			
System.out.println("\n------------------------------------------------------------------");

		System.out.println("\nArrayList isEmpty() method: To find out how many items there are");
		System.out.println(car.isEmpty());   								//  isEmpty()
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("\nLoop Through a HashSet:");
		for (String i : car) { 										//  Loop Through a HashSet
			  System.out.print(i + " ");
			}
			
	}

}
