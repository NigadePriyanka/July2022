package com.aspire.java.LogicalPrograms;
//*
//**
//***
//****
//*****
//****
//***
//**
//*
//rows=9; star1=5; star2=4
public class Num3 
{
public static void main(String[] args) 
{
	int rows;
	for(rows=1; rows<=5; rows++)
	{
		for(int star1=1; star1<=rows; star1++)
		{
			System.out.print("*");
	}
		System.out.println();
		
	
}
	for(rows=1; rows<=4; rows++)
	{
		for(int star2=4; star2>=rows; star2--)
		{
			System.out.print("*");
		
	}
		System.out.println();
}
}
}
