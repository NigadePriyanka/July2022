package com.aspire.java.LogicalPrograms;
//*
//**
//***
//****
//*****
//rows=5; star=5

  public class star4 
  {
      public static void main(String[] args) 
      {
		for(int rows=1; rows<=5; rows++)
		{
			for(int star=1; star<=rows; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
  }
