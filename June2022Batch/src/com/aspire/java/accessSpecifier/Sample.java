package com.aspire.java.accessSpecifier;

public class Sample 
{
   private void method1()
   {
	   System.out.println("Private Method");
   }
   protected void method2()
   {
	  System.out.println("Protected Method"); 
   }
   void method3()
   {
	   System.out.println("Default METHOD");
   }
   public void method4()
   {
	   System.out.println("Public method");
   }
   public static void main(String[] args) 
   {
	//Same class method execution
	   Sample object = new Sample();
	   object.method1();
	   object.method2();
	   object.method3();
	   object.method4();
}
}
