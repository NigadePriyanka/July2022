package com.aspire.java.accessSpecifier;
//without inheritance
public class Different 
{
 public static void main(String[] args) 
 {
	 Sample object = new Sample();
	 //object.method1(); // private method can accessed in same class
	 object.method2();
	 object.method3();
	 object.method4();
	 
}
}
