package com.aspire.java.LogicalPrograms;
//1
//23
//456
//78910
//rows=4; count=4
public class Num4 
{
	public static void main(String[] args) 
	{
		  int a=1;
		  for(int rows=1; rows<=4; rows++)
		  {
			    for(int count=1; count<=rows; count++)
			    {
			    	System.out.print(a);
			    	a++;
			    }
			    System.out.println();
		  }
	}

}
