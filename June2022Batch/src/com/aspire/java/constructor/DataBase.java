package com.aspire.java.constructor;

public class DataBase 
{
  //variable declaration
	String name;
	int mbNo;
	static String principalName;
	static String collegeName;
	
	//variable initialization
	DataBase()
	{
		System.out.println("From Constructor Body");
		System.out.println(name);
		System.out.println(mbNo);
		System.out.println(principalName);
		System.out.println(collegeName);
	}
	public void collegeData()
	{
		System.out.println("From Method Body");
		System.out.println(name);
		System.out.println(mbNo);
		System.out.println(principalName);
		System.out.println(collegeName);
	}
	
	
}
