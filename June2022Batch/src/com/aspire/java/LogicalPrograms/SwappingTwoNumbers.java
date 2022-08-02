package com.aspire.java.LogicalPrograms;

//a=10    a-->20
//b=20    b-->10
//with third variable 
public class SwappingTwoNumbers 
{
   public static void main(String[] args) 
   {
	int a=10;
	int b=20;
	int c;
	System.out.println("Before a="+a);
	System.out.println("Before b="+b); 
	c=a;   //c=10       a=10
	a=b;   //a=20       b=20
	b=c;   //b=10       c=10
	System.out.println("After a="+a);
	System.out.println("After b="+b); 
	
}
}
