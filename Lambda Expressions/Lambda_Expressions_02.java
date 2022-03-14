//  Lambda expressions were introduced in Java 8.
//  They are similar to methods, but they don't need a name.
//  Interface is must be  Functional Interface, & may be default, Static method 

interface LambaExpt {
	void m1(String s, int r);
	default void m2() {
		System.out.println("Hello Eneryone");
	}
}

public class Lambda_Expressions_02 {
	public static void main(String[] args) {

		LambaExpt lam = (s, r) -> {
			System.out.println(s+": Roll No: "+r);
		};
		lam.m1("Sankha", 73);
		lam.m2();
		
	}
}
