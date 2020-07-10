package com.Java.concepts;

public class SuperKeywordExample extends Superclass{
	   int num = 110;
	   void printNumber(){
		System.out.println(super.num);
	   }
	   public static void main(String args[]){
		   SuperKeywordExample obj= new SuperKeywordExample();
		obj.printNumber();	
	   }
}

class Superclass
{
   int num = 100;
}