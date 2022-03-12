package com;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Collections {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i : list) {
			System.out.print(i + " ");
			list.add(50);
		}
		System.out.println();
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

}
