package com.encapsulation;

public class Employee {
	private String empName;
	private Integer salary;
	
	public Employee() {}
	
	public Employee(String empName, Integer salary) {
		super();
		this.empName = empName;
		
		if(salary>=100000){
			this.salary = salary+1000;
		}else{
			this.salary = salary+2000;
		}
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	
	public void setSalary(Integer salary) {
		if(salary>=100000){
			this.salary = salary+1000;
		}else{
			this.salary = salary+2000;
		}
	}
}
