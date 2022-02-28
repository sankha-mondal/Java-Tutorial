package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class To_Add_Elements {
	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Amar");
		str.add("Akbar");
		str.add("Antony");
		str.add("Ram");
		str.add("Gita");
		str.add(3, "Moloy");
		str.add(5, "Divya");
		
		System.out.println(str);
		
		Iterator<String> it = str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
