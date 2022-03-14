//  Supplier Interface -> Don't take any input, but it returns output

import java.util.function.Supplier;

public class Supplier_Implementation {
	public static void main(String[] args) {
			
		Supplier<String> supply = () -> "Hello World";
		System.out.println(supply.get());
	}

}
