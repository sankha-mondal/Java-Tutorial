//  Lambda expressions were introduced in Java 8.
//  They are similar to methods, but they don't need a name.
//  Interface is must be  Functional Interface, & may be default, Static method 

@FunctionalInterface
interface LambaExp{
    void demo(int a, int b);
}


public class Lambda_Expressions_01 {
	public static void main(String[] args) {

		LambaExp obj = (a, b) -> {
			System.out.println("The value of a & b: "+a+","+b);	//  O/p: The value of a & b: 10,20
		};
		obj.demo(10, 20);
		
	}
}
