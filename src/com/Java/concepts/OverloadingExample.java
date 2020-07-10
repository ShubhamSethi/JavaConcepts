package com.Java.concepts;

class Demo
{
   public int add(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int add(int num1, int num2, int num3)
   {
       System.out.println("Second myMethod of class Demo");
       return num1+num2+num3;
   }
}
class Sample4
{
   public static void main(String args[])
   {
       Demo obj1= new Demo();
       obj1.add(10,10);
       obj1.add(20,12,18);
   }
}
