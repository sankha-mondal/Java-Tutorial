
class MyGeneric<T1, V1> {
	private T1 t1;
	private V1 v1;
	private String msg;
	
	public MyGeneric(T1 t1, V1 v1, String msg) {
		this.t1 = t1;
		this.v1 = v1;
		this.msg = msg;
	}
	
	public T1 getT1() {
		return t1;
	}
	public V1 getV1() {
		return v1;
	}
	public String getMsg() {
		return msg;
	}
}

public class Basic_Application_02 {
	public static void main(String[] args) {

        MyGeneric<String, Integer> g1 = new MyGeneric("You got ", 96, " in Mathematics");
        
        String str1 = g1.getT1();
        Integer int1 = g1.getV1();
        String str2 = g1.getMsg();
        
        System.out.println(str1 + int1 + str2);
    }

}
