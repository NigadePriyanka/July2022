package com.aspire.java.methods;

import com.aspire.java.methodsFromDifferentPackage.methods; 
// import packagename.classname

public class StaticMethodClass 
{
public static void method1()
    {
	System.out.println("Method call from same class");
    }
    public static void method2()
    {
    	System.out.println("static method 2 from same class");
    }
    public static void main(String[] args) 
    {
		System.out.println("Program starts here");
		method1(); //method name
		method2();
		StaticMethodFromDifferentClass.method3();  //classname.methodname()
		StaticMethodFromDifferentClass.method4();
		
		methods.method5();   //classname.methodname() + import package
		
		System.out.println("Program ends here");
	
}
}