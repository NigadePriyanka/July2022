package com.java.practice;

public class Bike extends Vehicle

{

float discountRate;



Bike()
{
	discountRate=1000;
	
}

public void display1()
{
	System.out.println(discountRate);
	
}
public static void main(String[] args) 
{
	Bike object = new Bike();
	object.display1();
	
	Vehicle object1 = new Vehicle();
	object1.display();
	
	
	
}
}