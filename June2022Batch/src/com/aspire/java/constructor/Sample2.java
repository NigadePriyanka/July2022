package com.aspire.java.constructor;

public class Sample2 
{
public static void main(String[] args) 
{
	Sample1 object1 = new Sample1();
	object1.addition();
	object1.multiplication();
	
	
	Sample1 object2 = new Sample1(10, 20);
	object2.addition();
	object2.multiplication();
	
}
}
