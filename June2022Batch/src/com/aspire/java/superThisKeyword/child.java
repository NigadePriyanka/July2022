package com.aspire.java.superThisKeyword;

public class child extends Parent
{
	
 int a=50;    //child class-global variables
 int b=60;
 
 public void method()
 {
	 int a=70;
	 int b=80;
	 int sum=super.a+this.b;
	 System.out.println(sum);
	 System.out.println("a="+a);// print local value from same method
	 System.out.println("Global a from child class="+this.a); // print global value from same class
	 System.out.println("Gloal a from parent class="+super.a);  // print global value from parent class
	 
 }
 public static void main(String[] args) 
 {
	child object = new child();
	object.method();
	
	
}
 
}
