package com.aspire.java.oops.inheritence.MultiLevel;

public class Test 
{
  public static void main(String[] args) 
  {
	System.out.println("******Parent*********");
	Parent p=new Parent();
	p.farm();
	Parent.car();
	
	
	System.out.println("******parent/Child*********");
	Parent_child pc = new Parent_child();
	pc.farm();   // same class
	pc.bunglow();  //Parent class
	Parent_child.car();
	
	
	
	System.out.println("******Child*********");
	Child c= new Child();
	c.farm();    // Grand Parent
	c.bunglow();  // Parent
	c.jewellary();  // Same Class
	Child.car();
	
	
	c.addition();
	
}
}
