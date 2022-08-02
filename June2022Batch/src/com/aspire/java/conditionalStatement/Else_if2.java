package com.aspire.java.conditionalStatement;

//budget, Iphone>1lacs, noteplus>30000, samsung>20000, redmi>10000, featurephone>1000
public class Else_if2 
{
public static void main(String[] args) 
{
	int budget=500;
	
	if(budget>=100000)
	{
		System.out.println("Iphone");
	}
	else if (budget>=30000)
	{
		System.out.println("Noteplus");
	}
	else if (budget>=20000)
	{
		System.out.println("samsung");
	}
	else if (budget>=10000)
	{
		System.out.println("redmi");
	}
	else if(budget>=1000)
	{
		System.out.println("Feature Phone");
	}
	else
	{
		System.out.println("No phone");
	}
}
}
