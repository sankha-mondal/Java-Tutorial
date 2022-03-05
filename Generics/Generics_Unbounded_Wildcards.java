
//  Generics Unbounded Wildcards means whatever be the type extends to own type

import java.util.Arrays;
import java.util.List;

public class Generics_Unbounded_Wildcards {
   public static void printAll(List<?> numberlist) {  //  whatever be the type extends to own type
      for (Object item : numberlist)
         System.out.println(item + " ");
   }

   public static void main(String args[]) {
	   
      List<Integer> integerList = Arrays.asList(1, 2, 3);
      printAll(integerList);
      
      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
      printAll(doubleList);
      
   }
}