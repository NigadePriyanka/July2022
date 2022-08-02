package com.aspire.java.constructor;

public class DataBaseTest 
{
public static void main(String[] args) 
{
	DataBase Priyanka = new DataBase();
	Priyanka.name="Priyanka Nigade";
	Priyanka.mbNo=77570222;
	DataBase.principalName="Kaluram Kakade";
	DataBase.collegeName="Dnyanasadhana";
	
	DataBase Pritam = new DataBase();
	Pritam.name="Pritam Maral";
	Pritam.mbNo=99755;
	
	// method call
	Priyanka.collegeData();
	Pritam.collegeData();
}
}
