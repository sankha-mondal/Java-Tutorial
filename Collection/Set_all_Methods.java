package com;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_all_Methods {
	public static void main(String[] args) {

		System.out.println("Declaration of HashSet Object:");
		
		HashSet<String> car = new HashSet<String>();
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("HashSet add() method: To add list elements");
		    car.add("Volvo");
		    car.add("BMW");
		    car.add("Ford");                        //  To add list elements  					  //  add()
		    car.add("Mazda");
		    System.out.println(car);
		    
		    System.out.println("\nHashSet Elements: ");
			Iterator<String> it = car.iterator();	//  Converting to Iterator
			while(it.hasNext()) {
				System.out.print(it.next() + " ");      //  To print list elements
			}
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("HashSet contains() method: To detect present or not");
		boolean ans = car.contains("BMW");									//  contains()
		System.out.println(ans);
			
System.out.println("\n------------------------------------------------------------------");			
			
		System.out.println("\nArrayList remove() method: To remove particular element");
		car.remove(0);												//  remove()
		System.out.println(car);
			
System.out.println("\n------------------------------------------------------------------");

		System.out.println("\nArrayList size() method: To find out how many items there are");	
		System.out.println("Length of HashSet: " + car.size());							//  size()
			
System.out.println("\n------------------------------------------------------------------");

		System.out.println("\nArrayList isEmpty() method: To find out how many items there are");
		System.out.println(car.isEmpty());   									//  isEmpty()
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("\nLoop Through an HashSet:");
		for (String i : car) {
			  System.out.print(i + " ");
			}

System.out.println("\n------------------------------------------------------------------");	


        		TreeSet<String> tree = new TreeSet<String>();
		
		    System.out.println("HashSet add() method: To add list elements");
		    tree.add("Mango");
		    tree.add("Apple");
		    tree.add("Onion");                        //  To add list elements  					  //  add()
		    tree.add("Karrot");
		    tree.add("Orange");
		    tree.add("Leamon");
		    System.out.println(tree);
		    
		   Iterator itr = car.descendingIterator();   //  Applicable for TreeSet Only
        		   System.out.println("Elements in Reverse Order:");
        			while (itr.hasNext()) {
       					System.out.println(itr.next());
        		                 }




			
	}

}

