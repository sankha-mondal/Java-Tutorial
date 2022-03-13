
interface Math {
	int getSqure(int n);
}

public class Mathematical_Operation {
	public static void main(String[] args) {

		System.out.println("Anonymously: ");
		Math obj1 = new Math() {
			
			@Override							//  Anonymously
			public int getSqure(int n) {
				return n*n;
			}
		};
		System.out.println("The Squre of 5: "+ obj1.getSqure(5));
		
		
		System.out.println("\nUsing Lambda Expression: ");
		Math obj2 = (n) -> n*n;							//   Lambda Expression
		System.out.println("The Squre of 5: "+ obj2.getSqure(5));
		
	}
}
