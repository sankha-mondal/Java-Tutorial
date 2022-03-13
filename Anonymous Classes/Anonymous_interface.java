
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
