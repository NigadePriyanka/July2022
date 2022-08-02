package com.aspire.java.LogicalLoops;

public class Do_While2 
{
  public static void main(String[] args) 
  {
	int passingmarks=40;
	int obtainedmarks=10;
	do
	{
		System.out.println("Apeear for the exam");
		obtainedmarks=obtainedmarks+5;
	}
	while(obtainedmarks<passingmarks);
   }
}

