package com.collection.map;

import java.util.Comparator;

public class SalarySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee arg1, Employee arg2) {
		if(arg1.getSalary()>arg2.getSalary()){
			return 1;
		}else if(arg1.getSalary()<arg2.getSalary()){
			return -1;
		}
		return 0;
	}
}
