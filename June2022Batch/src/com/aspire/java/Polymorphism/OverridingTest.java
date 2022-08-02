package com.aspire.java.Polymorphism;

public class OverridingTest 
{
  public static void main(String[] args) 
  {
	  System.out.println("*****Parent Class******");
	  OverridingParent p = new OverridingParent();
	  p.jewellary();
	  p.farm();
	  p.bunglow();
	  
	  System.out.println("*******Child Class********");
	  Overriding c = new Overriding();
	  c.jewellary();             //available in P&C
	  c.farm();                  //available in P&C
	  c.car();                  //available in C
	  c.bunglow();              //available in P
	  
  }
}
