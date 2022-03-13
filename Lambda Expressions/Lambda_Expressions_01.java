//  Lambda expressions were introduced in Java 8.
//  They are similar to methods, but they don't need a name.
//  interface is must

@FunctionalInterface
interface LambaExp{
    void demo(int a, int b);
}


public class Lambda_Expressions_01 {
	public static void main(String[] args) {

		LambaExp obj = (a, b) -> {
			System.out.println("The value of a & b: "+a+","+b);
		};
		obj.demo(10, 20);
		
	}
}
