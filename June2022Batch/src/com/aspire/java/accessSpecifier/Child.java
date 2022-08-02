package com.aspire.java.accessSpecifier;
//with inheritance in same package
public class Child extends Sample
{
   public static void main(String[] args) 
   {
	Sample object = new Sample();
	//object.method1();  //Not visible- private method only access in same class
	object.method2();
	object.method3();
	object.method4();
	
	
}
}
