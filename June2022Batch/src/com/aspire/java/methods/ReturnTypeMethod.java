package com.aspire.java.methods;

public class ReturnTypeMethod 
{
public static int addition()
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
	return sum;
}
	public static void main(String[] args) 
{
	int x=addition();
	System.out.println("return value assigned to x="+x);
	
}
}
