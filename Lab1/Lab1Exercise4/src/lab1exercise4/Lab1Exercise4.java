/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercise4;

/**
 *
 * @author work
 */
public class Lab1Exercise4 {

    public static int factorial(int n)
       {
         if(n == 1)
           {
            return n;   
           }
        return n*factorial(n-1);
       }
    
    public static int sumDigits(int n)
       {
         if(n < 10)
           {
            return n;   
           }
         return (n%10) + sumDigits(n/10);
       }
    
    public static int fibonacci(int n)
       { 
         if(n == 0 || n == 1)
           {
            return n;   
           }
         
         else
            return fibonacci(n-1) + fibonacci(n-2);
       }
    
    public static void main(String[] args) {
      
       
       System.out.println("Facotrial 8 is: " + factorial(8));
       System.out.println("The sum of the digits of 13243: " + 
                          sumDigits(13243));
       System.out.println("The fibonacci number in the 10th place: " + 
                          fibonacci(10));
    }
    
}
