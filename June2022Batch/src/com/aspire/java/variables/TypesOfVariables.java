package com.aspire.java.variables;

public class TypesOfVariables 
{
	// global variables are declare inside the class and outside the method
	int b;             // global variable
	int c=30;          // global variable
	static int p=10;   //inside the static method we cannot use non static variable
	static int q;      // in static method we can use only static data members.
	                   // in non static method we can use static as well as non static data members.
   public void method1()
   {
	   int a=10;  // local variable--> scope= only within the method body
	   b=100; 
	   System.out.println(a+b+c);
   }
   public void method2()
   {
	   int a=20;
	  
	   System.out.println(a+b+c);
   }
   public static void method3()
   {
	   
   }
   public static void method4()
   {
	   
   }
   public static void main(String[] args) 
   {
	   TypesOfVariables object = new TypesOfVariables();
	   object.method1();
	   object.method2();
	   System.out.println(object.b);    // declaration of non-static variable
	   System.out.println(object.c);    //non-static variable
	   System.out.println(p);           //declaration of static variable
	   System.out.println(q);           // static variable
	   
}
}
