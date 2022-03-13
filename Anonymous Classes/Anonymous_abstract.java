	//   Anonymous class is nothing but a class without any name.
	//   They are used to override a class method or interface.
	//   Anonymous classes in Java help us to write more concise and readable code.

abstract class Vehicle{
    abstract void drive();
}

public class Anonymous_abstract {
	public static void main(String[] args) {

		Vehicle v = new Vehicle() {
			
			@Override
			void drive() {
				System.out.println("This is an example of Anonymous Class");
			}
		};
		v.drive();
		
	}
}
