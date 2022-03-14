//  Supplier Functional Interface -> Don't take any input, but it returns output.
//  It can be used all the context where there is no input but output expected.
//  It has a functional method called T get() As Supplier is functional interface

import java.util.function.Supplier;

public class Supplier_Implementation {
	public static void main(String[] args) {
			
		Supplier<String> supply = () -> "Hello World";
		System.out.println(supply.get());
		
		
	}
}

