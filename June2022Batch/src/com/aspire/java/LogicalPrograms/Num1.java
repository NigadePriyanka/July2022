package com.aspire.java.LogicalPrograms;
//1
//11
//111
//1111
//11111
//rows=5; count/star=1

public class Num1 
{
public static void main(String[] args) 
{
	int rows=1;
	while(rows<=5)
	{
		int count=1;
		while(count<=rows)
		{
			System.out.print(1);
			count++;
		}
		System.out.println();
		rows++;
	}
}
}
