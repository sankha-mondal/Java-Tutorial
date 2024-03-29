package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_all_Methods {
	private static final String Sankha = null;

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		 
		System.out.println("ArrayList add() method: To add array elements");	
		str.add("Amar");
		str.add("Akbar");
		str.add("Antony");
		str.add("Ram");							//  To add array elements 
		str.add("Gita");
		str.add(3, "Moloy");
		str.add(5, "Divya");
		
		System.out.println("\nArrayList Elements: ");
		System.out.println(str);				//  To print array elements
		
		System.out.println("\nArrayList Elements: ");
		Iterator<String> it = str.iterator();	//  Converting to Iterator
		while(it.hasNext()) {
			System.out.println(it.next());      //  To print array elements
		} 
		
System.out.println("------------------------------------------------------------------"); 
			
		System.out.println("\nArrayList get() method: To Access an Item");
		System.out.println(str.get(2));
		System.out.println(str.get(3));
		System.out.println(str.get(5));
		
System.out.println("------------------------------------------------------------------"); 
		
		System.out.println("\nArrayList set() method: To Change an Item");
		str.set(2,"Sankha");
		System.out.println(str);
		
System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nArrayList remove() method: To Clear ArrayList");
		str.remove(0);	
		System.out.println(str);
		
System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nArrayList clear() method: To Remove all Item");
		/*str.clear();
		System.out.println(str);*/

System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nArrayList size() method: To Remove an Item"); 
		System.out.println(str.size());
			
System.out.println("------------------------------------------------------------------"); 	

		System.out.println("\nLoop Through an ArrayList");
		System.out.println("ArrayList Elements: ");
		for (int i=0; i<str.size(); i++) {
			System.out.print(str.get(i) + "  ");
		}
		System.out.println("\nArrayList Elements: ");
		for (String i : str) {
		      System.out.print(i+ "  ");
		    }
		
System.out.println("\n------------------------------------------------------------------"); 	

  		System.out.println("Sort an ArrayList: Ascending order");
		Collections.sort(str);
		for (String i : str) {
		      System.out.println(i);
	    }
		System.out.println("\nSort an ArrayList: Descending order");
		//Collections.sort(str,Comparator.reverseOrder() );
		Collections.reverse(str);
		for (String i : str) {
		      System.out.println(i);
	    }
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("ArrayList indexOf() method: To identify index");
		int pos = str.indexOf("Sankha");
		System.out.println("The element is at index : " + pos);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("ArrayList contains() method: To detect present or not");
		boolean ans = str.contains("Sankha");
		System.out.println(ans);
		
		
	}

}
