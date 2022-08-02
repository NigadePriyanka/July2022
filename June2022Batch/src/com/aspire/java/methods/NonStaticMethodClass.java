package com.aspire.java.methods;

import com.aspire.java.methodsFromDifferentPackage.methods;

public class NonStaticMethodClass 
{
	public void method11()      //non static method
	{
		System.out.println("Non static method 11 from same class");
	}
	public void method12()      //non static method
	{
		System.out.println("Non static method 12 from same class");
	}
	public static void method13()    //static method
	{
		System.out.println("Non static method 13 from same class");
	}
    public static void main(String[] args) 
       {
	          //classname objectname= new classname();
    	NonStaticMethodClass object= new NonStaticMethodClass();
    	object.method11();
    	object.method12();
    	object.method13();
    	method13();
    	
    	
    	
    	
    	methods diffPackObject=new methods();
    	
    	diffPackObject.method16();
    	
    	
    	
    	
    	
       }
}
