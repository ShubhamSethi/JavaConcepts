package com.Java.concepts;

import java.util.Scanner;

public class PrimeNumberExample {
	//check for number prime or not 
    static boolean isPrime(int n) { 
    //check if n is a multiple of 2 
    if (n%2==0) return false; 
    //if not, then just check the odds 
    for(int i=3;i<=Math.sqrt(n);i+=2) { 
        if(n%i==0) 
            return false; 
    } 
    return true; 
} 
      
    // Driver Program 
    public static void main(String[] args)  
    { 
    	Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    	System.out.print("Enter first number- ");
    	int num= sc.nextInt();
         if(isPrime(num))  
         System.out.println(" true") ; 
          
         else 
         System.out.println(" false"); 
         
         sc.close();
           
    } 
}
