package com;

import java.util.HashMap;
import java.util.Iterator;

public class Map_all_Method {
	public static void main(String[] args) {

		 // Create a HashMap object called capitalCities
	    HashMap<Integer , String> capital = new HashMap<Integer, String>();

	    System.out.println("HashMap put() method: To add HashMap elements");
	    
	    capital.put(1, "London");
	    capital.put(2, "Berlin");
	    capital.put(3, "Oslo");											//  put()
	    capital.put(4, "Washington");
	    
	    System.out.println(capital);
	    
System.out.println("\n------------------------------------------------------------------");

	System.out.println("\nHashMap get() method: To Access an Item");
	System.out.println(capital.get(2));										//  get()
	
System.out.println("\n------------------------------------------------------------------");

	System.out.println("\nHashMap remove() method: To remove particular element");
	capital.remove(3);												//  remove()
    	System.out.println(capital);
	
System.out.println("\n------------------------------------------------------------------");
	
	System.out.println("\nLoop Through a HashMap");
	System.out.println("Use keySet() and values() if you only want the keys & values:");
	for (int i : capital.keySet()) {										//  keySet() &  values()
		  System.out.println("key: " + i + " value: " + capital.get(i));
		}
	
System.out.println("\n------------------------------------------------------------------");	
	
	System.out.println("\nHashMap replace(): To replace according to key");
	String value = capital.replace(2, "India");									//  replace()
	System.out.println("Updated Languages: " + capital);

System.out.println("\n------------------------------------------------------------------");	
	
	System.out.println("\nHashMap replace(): If the specified key is not already associated with a value ");
	capital.putIfAbsent(2, "USA");											//  putIfAbsent()
    	System.out.println("Updated Languages: " + capital);
    
	}
}
