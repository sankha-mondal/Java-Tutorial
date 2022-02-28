package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList_all_Method {

	public static void main(String[] args) {
		
		    LinkedList<String> car = new LinkedList<String>();
		    
		    System.out.println("LinkedList add() method: To add list elements");
		    car.add("Volvo");
		    car.add("BMW");
		    car.add("Ford");                        //  To add list elements
		    car.add("Mazda");
		    System.out.println(car);
		    
		    System.out.println("\nArrayList Elements: ");
			Iterator<String> it = car.iterator();	//  Converting to Iterator
			while(it.hasNext()) {
				System.out.println(it.next());      //  To print list elements
			}
					
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("LinkedList addFirst() method: To add list element at 0th index");
		car.addFirst("Maruti");
	    	System.out.println(car);

System.out.println("\n------------------------------------------------------------------");

		System.out.println("LinkedList addLast() method: To add list element at Last-th index");
		car.addLast("Maruti");
		System.out.println(car);

System.out.println("------------------------------------------------------------------"); 
			
		System.out.println("\nArrayList set() method: To Change an Item");
		car.set(2,"Royal");
		System.out.println(car);
			
System.out.println("------------------------------------------------------------------"); 
			
		System.out.println("\nLinkedList get() method: To Access an Item");
		System.out.println(car.get(2));
			
System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nArrayList remove() method: To remove particular element from LinkedList");
		car.remove(0);	
		System.out.println(car);
			
System.out.println("\n------------------------------------------------------------------");

		System.out.println("LinkedList removeFirst() method: To remove list element at 0th index");
		car.removeFirst();
                                      System.out.println(car);
		    
System.out.println("\n------------------------------------------------------------------");		    
			
		System.out.println("LinkedList removeLast() method: To remove list element at last-th index");
		car.removeLast();
		 System.out.println(car);
		    
System.out.println("------------------------------------------------------------------");

		System.out.println("LinkedList getFirst() method: To fatch 1st element of List");
		System.out.println(car.getFirst());
			
System.out.println("------------------------------------------------------------------");			
			
		System.out.println("LinkedList getLast() method: To fatch Last element of List");
		System.out.println(car.getLast());
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("LinkedList contains() method: To detect present or not");			
		boolean ans = car.contains("BMW");
		System.out.println(ans);
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("ArrayList indexOf() method: To identify index");
		int pos = car.indexOf("Royal");
		System.out.println("The element is at index : " + pos);
			
System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nLoop Through an ArrayList");
		System.out.println("ArrayList Elements: ");
		       for (int i=0; i<car.size(); i++) {
			System.out.print(car.get(i) + "  ");
			}			
			
			
			
			
	}
}
