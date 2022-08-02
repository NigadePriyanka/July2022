package com.aspire.java.methods;

public class ParameterizedMethods 
{
	public static void addition(int a, int b) 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void subtraction(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	public void multiplication(int a, int b)
	{
		int multi=a*b;
		System.out.println(multi);
	}
	public void division(int a, int b)
	{
		int div=a/b;
				System.out.println(div);
	}
public void main(String[] args) 
{
	addition(10, 20);
	addition(50,5);
	subtraction(20, 10);
	subtraction(30, 20);
	ParameterizedMethods object = new ParameterizedMethods();
    object.multiplication(6, 4);	
    object.division(5,50);
}
}
