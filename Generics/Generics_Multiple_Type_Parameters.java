


class Page<T, S> {     					//  Generics class Page
	private T t;
	private S s;
	
	public void setVal(T t,S s) {		//  setter() method: callee
		this.t = t;
		this.s = s;
	}
	public T getter1() {				//  getter() method: callee
		return t;
	}
	public S getter2() {				//  getter() method: callee
		return s;
	}
}

public class Generics_Multiple_Type_Parameters {
	public static void main(String[] args) {
	    
	      Page<Integer, String> page1 = new Page<>();		//  Multiple Type Parameters <Integer, String>
	      page1.setVal(10,"Hello World");					//  caller 
	     
	      System.out.printf("Integer Value :%d\n", page1.getter1());	//  calling
	      System.out.printf("String Value :%s\n", page1.getter2());		//  calling
	      
	      System.out.println();
	      
	      Page<String, String> page2 = new Page<>();		//  Multiple Type Parameters <String, String>
	      page2.setVal("Hello","Everyone");					//  caller

	      System.out.printf("String Value :%s\n", page2.getter1());		//  calling
	      System.out.printf("String Value :%s\n", page2.getter2());		//  calling
	      
	   
	}
}