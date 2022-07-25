package com.java.practice;

public class Vehicle 
{
	//Variable declaration
	String vehiclename;
	int  vmodelno;
	float vprice;
	String servicest;
	
	
	//Constructor 
	Vehicle()
	{
		vehiclename="XUV";
		vmodelno=1234;
		vprice=24563f;
		servicest="Atul service center";
		
	}
	
	//Display method
	public void display()
	{
		System.out.println(vehiclename);
		System.out.println(vmodelno);
		System.out.println(vprice);
		System.out.println(servicest);
	}
	
	//main method
	
public static void main(String[] args) 
{
	Vehicle object = new Vehicle();
	object.display();
		
}
}
