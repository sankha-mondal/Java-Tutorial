//   Anonymous class is nothing but a class without any name.
//   They are used to override a class method or interface.
//   Anonymous classes in Java help us to write more concise and readable code.

interface Human{
    void walk();	//  abstract and public
}

public class Anonymous_interface {
	public static void main(String[] args) {
		
		Human h = new Human() {
			
			@Override
			public void walk() {
				System.out.println("Human can talk");
			}
		};
		h.walk();
		
	}
}
