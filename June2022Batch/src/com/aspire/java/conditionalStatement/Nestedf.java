package com.aspire.java.conditionalStatement;

//Valid voter age           Valid marriage age           Senior Citizen age
// Female=18                        18                         60
// Male =18							21		                    60					
public class Nestedf 
{
public static void main(String[] args)
  {
	int age=35;
	String gender="Male";
	{
		if(age>=18)
		{
			System.out.println("The Person is valid voter");
			
			if(gender=="Male")
			{
				
				if(age>=21)
				{
					System.out.println("Marriage age=valid");
				}
				
				else
				{
				System.out.println("The person is having invalid marriage age");
			}
			
			else //gender=male
			{
				System.out.println("Hi");
			}
		}
	}
	}
   }
}
