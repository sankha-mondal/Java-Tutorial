/*	Consumer Functional Interface can be used in all contexts 
*       where an object needs to consumed
*/

import java.util.function.Consumer;

public class Consumer_Implement_Normal {
	public static void main(String[] args) {

		Consumer<String> consumer = msg -> System.out.print(msg);
		
		consumer.accept("Hello Everyone...!!");			//  accept() 
		
	}
}

