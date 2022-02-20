/* GradeSystem System of Student using Java  */

import java.util.Scanner;

public class GradeSystem {     

public static void main(String[] args) {           

          Scanner sc = new Scanner(System.in);  
          int maths = sc.nextInt();        
          int physics = sc.nextInt();        
          int chemistry = sc.nextInt();              
          int avg = (maths+ physics+ chemistry) / 3;              

         if(maths < 35 || physics < 35 || chemistry < 35)    
              System.out.println("Result: Failed");           
         else if(avg <= 60)              
              System.out.println("C");        
         else if(avg<=70  &&  avg>60)          
              System.out.println("B");        
          else if(avg<=100  &&  avg>70)           
              System.out.println("A");               
          else
              System.out.println("Invalid Input");            
      
        }
}

