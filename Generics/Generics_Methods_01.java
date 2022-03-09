

class GenMet<T> {
	void read(T t1,T t2) {
		System.out.println(t1+" "+t2);
	}
	T getInfo(T t) {
		return t;
	}
}


public class Generics_Methods_01 {
	public static void main(String[] args) {
		
		GenMet gm = new GenMet();
		gm.read(10, 20);
		gm.read(10.10, 20.20);
		gm.read("Ravi", 18);
		gm.read("Sonal","Rohit");
		
		System.out.println(gm.getInfo(100));
		System.out.println(gm.getInfo("Generics"));
	}
}
