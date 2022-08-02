package com.aspire.java.constructor;

public class Sample 
{
	// Global Variable - default values will display by constructor if values are 
	//not given        Default Values
	 
	//1. Declaration
	int a;           //0
	 float b;         //0.0
	 char c;          // space
	 boolean d;       //false
	 String e;        //null
	 
	 public Sample()     // Constructor
	 {
		 //2. Initialization
		 a=10;
		 b=11.3f;
		 c='A';
		 d=true;
		 e="Aspire";
		 
	 }
	 public void method()
	 {
		 int e = 10;  // local variable have to give value
		 //3. Use
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
	 }
public static void main(String[] args) 
{
     Sample object = new Sample();
     // ClassName ObjectName = new constructor
     object.method();
     
    		 
}
}
