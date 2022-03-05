
class Box<T> {     					//  Generics class
	private T t;
	
	public void setVal(T t) {		//  setter() method: callee
		this.t = t;
	}
	public T getVal() {				//  getter() method: callee
		return t;
	}
}

public class Basic_Application_01 {
	public static void main(String[] args) {
	    
	      Box<Integer> integerBox = new Box<>();		//  for Integer type operation
	      Box<String> stringBox = new Box<String>();	//  for String type operation

	      integerBox.setVal(10);						//  caller 
	      stringBox.setVal("Hello World");				//  caller

	      System.out.printf("Integer Value :%d\n", integerBox.getVal());	//  calling
	      System.out.printf("String Value :%s\n", stringBox.getVal());		//  calling
	   
	}
}
