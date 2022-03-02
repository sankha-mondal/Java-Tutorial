package com.List.Vector.Stack;

import java.util.Stack;

public class Stack_all_Methods {
	public static void main(String[] args) {
		
		Stack<Integer> stk= new Stack<>();     										//  Declaration of stack
		
		System.out.println("Stack empty():To ckeck stack is empty or not");
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result); 

System.out.println("\n------------------------------------------------------------------");

		System.out.println("Stack push():To store into stack");
		stk.push(10);  
		stk.push(20);  																//  push()
		stk.push(30);  					
		stk.push(40);  
		System.out.println("Elements in Stack: " + stk);  
		
System.out.println("\n------------------------------------------------------------------");

		System.out.println("Stack peek():To print last entry but not delete from stack");
		int last = stk.peek();														//  peek()
		System.out.println("Last entry element in Stack: " + last); 

System.out.println("\n------------------------------------------------------------------");

		System.out.println("Stack pop():To print last entry and remove from stack");
		int remove = stk.pop();														//  pop()
		System.out.println("POP element of Stack: " + remove);
		System.out.println("Elements in Stack: " + stk);

System.out.println("\n------------------------------------------------------------------");

		System.out.println("Stack search():To  To identify index in stack");
		int found = stk.search(20);													//  search()
		System.out.println("Element found at index: " + found);
	}
}
