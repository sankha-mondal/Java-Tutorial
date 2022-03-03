package com;

import java.util.*;

public class Queue_all_Methods {
	public static void main(String[] args) {

		
		Queue<String> animal1 = new LinkedList<>(); 	 	// LinkedList implementation of Queue (FIFO DS)
		
		Queue<String> animal2 = new ArrayDeque<>();		// Array implementation of Queue (FIFO DS)

		Queue<String> animal3 = new PriorityQueue<>(); 		// Priority Queue implementation of Queue (FIFO DS)
		
		System.out.println("Queue add() method: To add list elements");
			animal1.add("cow");
			animal1.add("dog");
			animal1.add("cat");                      						  //  add()
			animal1.add("rat");
	    	System.out.println(animal1);

System.out.println("\n------------------------------------------------------------------");
	    	
		System.out.println("Queue offer() method: To add list elements");
			animal1.offer("tiger");
			animal1.offer("lion");  
			animal1.offer("deer");									//  offer()
			animal1.offer("fox");
			System.out.println(animal1);
	    	
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Queue remove(): Return head of queue and remove from queue");
			String remove = animal1.remove();							//  remove()
			System.out.println("Head of queue: " + remove);
			System.out.println(animal1);

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Queue poll(): Return head of queue and remove from queue");
			String poll = animal1.poll();								//  poll()
				System.out.println("Head of queue: " + poll);
				System.out.println(animal1);
	
System.out.println("\n------------------------------------------------------------------");

		System.out.println("Queue element(): Retrieves,but does not remove,the head from queue");
			String element = animal1.element();							//  element()
				System.out.println("Head of queue: " + element);
				System.out.println(animal1);  	
	
System.out.println("\n------------------------------------------------------------------");

System.out.println("Queue peek(): Retrieves,but does not remove,the head from queue");
			String peek = animal1.peek();								//  peek()
					System.out.println("Head of queue: " + peek);
					System.out.println(animal1);
	}
}
