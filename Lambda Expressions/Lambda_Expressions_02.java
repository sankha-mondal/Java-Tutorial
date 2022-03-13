//  Lambda expressions were introduced in Java 8.
//  They are similar to methods, but they don't need a name.
//  interface is must

interface LambaExpt {
	void m1(String s, int r);
}

public class Lambda_Expressions_02 {
	public static void main(String[] args) {

		LambaExpt lam = (s, r) -> {
			System.out.println(s+": Roll No: "+r);
		};
		lam.m1("Sankha", 73);
		
	}
}
