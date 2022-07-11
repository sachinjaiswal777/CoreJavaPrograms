package com.encapsulation;

public class EncapsulationTest {
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmpName("Sachin");
		emp.setSalary(15000);
		System.out.println(emp.getSalary());	
		
		Employee emp2 = new Employee("Manju",100000);
		System.out.println(emp2.getSalary());
	}
}
