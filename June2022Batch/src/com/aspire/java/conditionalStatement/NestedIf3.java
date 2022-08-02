package com.aspire.java.conditionalStatement;
//Application login
//UN,PWD,OTP
public class NestedIf3 
{
public static void main(String[] args) 
{
	String UN="xyz";
	String PWD="Abc@1234";
	int OTP=123456;
	
	if(UN=="xyz")
	{
		if(PWD=="Abc@1234")
		{
			if(OTP==123456)
			{
				System.out.println("Application login sucessful");
			}
		}
	}
	
	
	else
	{
		System.out.println("UN or PWD is wrong");
	}
}
}
