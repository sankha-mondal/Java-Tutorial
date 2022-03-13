
//		Functional Interface has only one method in it's class body

@FunctionalInterface
interface Lambda {
    void demo(int a, int b);
    // void demo1();
}


public class Functional_Interface {
	public static void main(String[] args) {

		Lambda obj = (a, b) -> {
			System.out.println("The value of a & b: "+a+","+b);
		};
		obj.demo(10, 20);
		
	}
}