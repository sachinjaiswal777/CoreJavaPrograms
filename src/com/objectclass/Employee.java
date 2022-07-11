package com.objectclass;

public class Employee{
	private String empName;
	private Integer age;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.age=28;
		emp.empName = "ABC";
		Employee emp2 = new Employee();
		System.out.println(emp.getClass()); //class com.objectclass.Employee
		System.out.println(emp.hashCode()); //366712642
		System.out.println(emp.toString()); //com.objectclass.Employee@15db9742
		System.out.println(emp.equals(emp2)); //false
	}
}
