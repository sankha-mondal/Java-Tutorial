//   Lambda Expressions use in Collection framework

import java.util.ArrayList;

public class Collection_Lambda_Expressions {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Normal looping: ");
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nAfter using Lambda Expressions:");
		list.forEach( (n) -> System.out.print(n + " "));
	}
}
