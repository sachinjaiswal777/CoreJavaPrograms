package com.keywords;

public class StaticTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empname= "A";
		e1.counter = 1;
		
		
		Employee e2 = new Employee();
		e2.empname= "B";
		e2.counter = 2;
		
		Employee.counter = 3;
		
	
		//System.out.println(Employee.pi);
		Employee.incrementCounter(); //4
		Employee.incrementCounter(); //5
		Employee.incrementCounter(); //6
		System.out.println(Employee.counter);
	}
}
