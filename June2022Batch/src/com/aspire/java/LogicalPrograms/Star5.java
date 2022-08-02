package com.aspire.java.LogicalPrograms;

//    *
//    **
//   ***
//   ****
//  *****
//  ****
//   ***
//   **
//    *
// rows1=5, star1=5, space1=4
// rows2=4, star2=4, space2=4

public class Star5 
{
  public static void main(String[] args) 
   {
	for(int rows1=1; rows1<=5; rows1++)
	{
		for(int space1=4; space1>=rows1; space1--)
		{
			System.out.print(" ");
			
		}
		for(int star1=1; star1<=rows1; star1++)
		{
		System.out.print("*");
	}
	
		System.out.println();
	}
	for(int rows2=1; rows2<=4; rows2++)
	{
		
	
	for(int space2=1; space2<=rows2; space2++)
	{
		System.out.print(" ");
	}
	   for(int star2=4; star2>=rows2; star2--)
	   {
		   System.out.print("*");
	   }
	   System.out.println();
   }
   }
   }

