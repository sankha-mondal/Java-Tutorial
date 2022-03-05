
//  Generics Upper Bounded Wildcards means whatever be the type extends to Specific type(Number)

import java.util.Arrays;
import java.util.List;

public class Generics_Upper_Bounded_Wildcards {

   public static double sum(List<? extends Number> numberlist) {  //  whatever be the type extends to Number
      double sum = 0.0;
      for (Number n : numberlist) 
    	  sum += n.doubleValue();
      return sum;
   }

   public static void main(String args[]) {
      List<Integer> integerList = Arrays.asList(1, 2, 3);
      System.out.println("sum = " + sum(integerList));

      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
      System.out.println("sum = " + sum(doubleList));
   }
}