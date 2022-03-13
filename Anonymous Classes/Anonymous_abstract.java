 
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
