package com.aspire.java.LogicalPrograms;
//*****
//*****
//*****
//*****
//star=5,rows=4
	
    
public class star4_while 
{
	public static void main(String[] args) 
    {
		int rows=1;
		while(rows<=5)
		{
			int star=1;
			while(star<=rows)
			{
				System.out.println("*");
				star++;
				System.out.println();
			}
		
    }
}
}