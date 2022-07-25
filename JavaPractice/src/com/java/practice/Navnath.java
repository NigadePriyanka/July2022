package com.java.practice;
class a
{
	public static void employee()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
}

class b extends a
{
	public static void employee1()
	{
	int c=30;
	int d=40;
	System.out.println(c+d);
	}
	
}
public class Navnath 
{
	public static void main(String[] args) 
	{
	b.employee();
	b.employee1();

	}

}
