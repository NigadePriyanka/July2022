package com.aspire.java.methods;

public class ReturnTypeMethod2 
{
	
	public static int addition(int a, int b)
	{
		int add=a+b;
		return add;
	}
	public int subtraction(int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	
	public static void sample()
	{
		int a=10;
		short b=20;
		byte c=30;
		long d=40;
		float e=50.2f;
		double f=60.3d;
		char g='z';
		boolean h=true;
		string i="Aspire";
		return c;
	}
public static void main(String[] args) 
{
	int x=addition(100, 20);
	ReturnTypeMethod2 object = new ReturnTypeMethod2();
	int y= object.subtraction(100, 20);
	int multi;
	multi=x*y;
	System.out.println(multi);
	
}
}
