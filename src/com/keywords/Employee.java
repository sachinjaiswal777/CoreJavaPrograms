package com.keywords;

public class Employee {
	public String empname;
	public static Integer counter=0;
	public static final double pi = 3.14;
	
	{
		System.out.println("Instance Block Called");
	}
	
	static{
		counter=1;
		System.out.println("Static Block Called");
	}
	
	public Employee(){
		System.out.println("Constructor Called");
	}
	
	public static void incrementCounter(){
		counter=counter+1;
		System.out.println("Static Method Called");
	}
	
	public void incrementCounterTwo(){
		counter=counter+1;
		empname="A";
	}
}
