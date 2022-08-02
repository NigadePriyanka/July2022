package com.aspire.java.conditionalStatement;

//exam result
//>100, >=75, >=60, >=40, <40

public class Else_if 
{
public static void main(String[] args) 
{
	int obtainedMarks=110;
	int passingMarks=40;
	if(obtainedMarks>100)
	{
		System.out.println("Invalid Marks Plaese check again");
	}
	
	else if(obtainedMarks>=75)
	{
		System.out.println("Distinction");
		
	}
	
	else if(obtainedMarks>=60)
	{
		System.out.println("First lass");
		
	}
	else if(obtainedMarks>=40)
	{
		System.out.println("Passing Score");
	}
	else
	{
		System.out.println("Fail score");
	}
}
}
