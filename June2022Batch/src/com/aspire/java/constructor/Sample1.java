package com.aspire.java.constructor;

public class Sample1 
{
   int a; //instance or non-static variable
   int b;
   Sample1()
   {
	   a=50; 
	   b=100;
   }
   Sample1(int c, int d)
   {
	   a=c;
	   b=d;
   }
   public void addition()
   {
	   int add=a+b;
	   System.out.println("Addition of a and b ="+add);
   }
   
   public void multiplication()
   {
	   int Multi=a*b;
	   System.out.println("Multiplication of a and b ="+Multi); 
   }
   public static void main(String[] args) 
   {
	
   }
   
}
