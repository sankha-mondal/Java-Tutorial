import java.util.ArrayList;
import java.util.List;

class Boxx<T, S> {
   private T t;
   private S s;

   public void add(T t, S s) {
      this.t = t;
      this.s = s;
   }

   public T getFirst() {
      return t;
   } 

   public S getSecond() {
      return s;
   } 
}

public class Generics_Parameterized_Types {
	 public static void main(String[] args) {
	      Boxx<Integer, List<String>> box = new Boxx<Integer, List<String>>();
	      
	      List<String> messages = new ArrayList<String>();
	      
	      messages.add("Hi");
	      messages.add("Hello");
	      messages.add("Bye");      
	      
	      box.add(Integer.valueOf(10),messages);
	      System.out.printf("Integer Value :%d\n", box.getFirst());
	      System.out.printf("String Value :%s\n", box.getSecond());

	      
	   }
}
