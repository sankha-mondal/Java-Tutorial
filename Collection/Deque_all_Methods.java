package com;

import java.util.*;

public class Deque_all_Methods {
	public static void main(String[] args) {

		Deque<String> dqu = new ArrayDeque<String>();  //   Declaration of Deque (double ended queue)
		
		System.out.println("Deque add() method: To add ArrayDeque elements");
		   dqu.add("Ravi");    
		   dqu.add("Vijay");     										//  add()
		   dqu.add("Ajay"); 
		   System.out.println(dqu);
		   
		   System.out.println("\nArrayDeque Elements: ");
			Iterator<String> it = dqu.iterator();	//  Converting to Iterator
			while(it.hasNext()) {
				System.out.print(it.next()+" ");      //  To print list elements
			}
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque addFirst(): Inserts specific element at the HEAD of queue");
		dqu.addFirst("Gita");    										//  addFirst()
		System.out.println(dqu);
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque addLast(): Inserts specific element at the TAIL of queue");
		dqu.addLast("Mita");    										//  addLast()
		System.out.println(dqu);			

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("LinkedList contains() method: To detect present or not");			
		boolean ans = dqu.contains("Vijay");									//  contains()
		System.out.println(ans);

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque element(): Retrieves, but does not remove, the head from queue");
		String element  = dqu.element();    									//  element()
		System.out.println(element);
			
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque getFirst(): Retrieves, but does not remove,the first element from deque.");
		String getFirst  = dqu.getFirst();    									//  getFirst()
		System.out.println(getFirst);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque getLast(): Retrieves, but does not remove,the last element from deque.");
		String 	getLast  = dqu.getLast();    									//   getLast()
		System.out.println(getLast);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque offer(): Inserts the specified element into the queue");
		dqu.offer("Rohit");
		dqu.offer("Joti");											//  offer()
		System.out.println(dqu);		
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque offerFirst(): Inserts the specified element at HEAD into the queue");
		dqu.offerFirst("Amar");											//  offerFirst()
		System.out.println(dqu);	
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque offerLast(): Inserts the specified element at TAIL into the queue");
		dqu.offerLast("Akbar");											//    offerLast()
		System.out.println(dqu);		
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque peek(): Retrieves, but does not remove, the HEAD from queue");
		System.out.println("HEAD element: " + dqu.peek());								//  peek()
		System.out.println(dqu);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque peekFirst(): Retrieves, but does not remove, the HEAD from queue");
		System.out.println("HEAD element: " + dqu.peekFirst());								//  peekFirst()
		System.out.println(dqu);		
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque peekLast(): Retrieves, but does not remove, the TAIL from queue");
		System.out.println("TAIL element: " + dqu.peekLast());  								//  peekLast()
		System.out.println(dqu);		

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque poll(): Retrieves and removes the HEAD from queue");
		System.out.println("TAIL element: " + dqu.poll());									//  poll()
		System.out.println(dqu);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque pollFirst(): Retrieves and removes the HEAD from queue");
		System.out.println("TAIL element: " + dqu.pollFirst());								//  pollFirst()
		System.out.println(dqu);

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque pollLast(): Retrieves and removes the TAIL from queue");
		System.out.println("TAIL element: " + dqu.pollLast()); 			    					//  pollLast()
		System.out.println(dqu); 
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque pop(): Retrieves and removes the HEAD from queue");
		System.out.println("HEAD element: " + dqu.pop());								//  pop()
		System.out.println(dqu);
	
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque push():Pushes an element at HEAd end of queue");
		dqu.push("Tom");
		dqu.push("Jerry");												//  push()
		System.out.println(dqu);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque remove(): Retrieves and removes the HEAD from queue");
		System.out.println("Remove element: " + dqu.remove());							//  remove()
		System.out.println(dqu);	
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque removeFirst(): Retrieves and removes the HEAD from queue");
		System.out.println("Remove element: " + dqu.removeFirst());						// removeFirst()
		System.out.println(dqu);	

System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque removeLast(): Retrieves and removes the TAIL from queue");
		System.out.println("Remove element: " + dqu.removeLast());						//  removeLast()
		System.out.println(dqu);
		
System.out.println("\n------------------------------------------------------------------");	

		System.out.println("Deque size(): Returns the number of elements in this deque");
		System.out.println("Size of queue: " + dqu.size());  								//  size()
		
	}
}
