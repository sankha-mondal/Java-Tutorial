/*  Write a program to print a number is Prime or Not  */
   
import java.util.Scanner;

class PrimeNumber {    
     public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int flag=0;      
     int n = sc.nextInt();  

  if(n==0 || n==1) 
        System.out.println(n+" is not prime number");      
  else {  
        for(int i=2;i<=n/2;i++){      
        if(n%i==0){      
            System.out.println(n+" is not prime number");      
            flag=1;      
            break;      
        }      
   }      
   if(flag==0)   
        System.out.println(n+" is prime number"); }  
   
    }    
}