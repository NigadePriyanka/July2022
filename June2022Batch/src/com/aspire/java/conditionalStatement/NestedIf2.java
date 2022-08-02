package com.aspire.java.conditionalStatement;

//0%         10%             20%             30%
//0-2.5       2.5-5          5-7.5            7.5-10

public class NestedIf2 
{
	public static void main(String[] args) 
	{
		
	int income = 600000;

		if(income<=250000)
		{
			System.out.println("2.5-5 10% tax");
			if(income>500000)
			{
				System.out.println("5-7.5 20% tax");
				if(income>750000)
				{
					System.out.println("7.5-10 30% tax");
				}
			}
		}
		else  //income<=250000
		{
			System.out.println("0 tax");
		}
	}

}
