package com.aspire.java.conditionalStatement;
//ATM
public class Switch2 
{
public static void main(String[] args) 
{
	String option="BC";
	
	switch(option)
	{
	case "BC":
		System.out.println("Balance check");
		break;
	case "CW":
	System.out.println("cash withdraw");
	break;
	
	case "PC":
	System.out.println("Pin Change");
	break;
	case "FT":
	System.out.println("Fund Transfer");
	break;
	case "MS":
		System.out.println("Mini Statement");
	break;
	default:
		System.out.println("Invalid/cancel/timeout");
		break;
	}
}
}
