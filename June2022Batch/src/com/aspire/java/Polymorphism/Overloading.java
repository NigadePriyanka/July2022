package com.aspire.java.Polymorphism;

public class Overloading extends Parent
{
	int i=10;    //global variable
	int j=20;
	int sum;
	
 public void addition()
 {
	 sum=i+j;
	 System.out.println(sum);
 }
 public void addition(int a)
 {
	 sum=i+a;
	 System.out.println(sum);
 }
 public void addition(int a, int b)
 {
	 sum=a+b;
	 System.out.println(sum);
 }
 public void addition(int a, int b, int c)
{
	sum=a+b+c;
	System.out.println(sum);
}
 public static void main(String[] args) 
 {
	 Overloading object = new Overloading();
	 object.addition();   //30
	 object.addition(2);  //12
	 object.addition(5, 10);   //15
	 object.addition(15, 20, 25);  //60
	 
 }
 public static void main()
 {
	 System.out.println("Here we overload the main method");
 }
 public static void main(int a)
 {
	 System.out.println("Here we overload the main method");
 }
}










