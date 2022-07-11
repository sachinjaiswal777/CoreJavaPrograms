package com.collection.map;

import java.util.Comparator;

public class DeptSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee arg1, Employee arg2) {
		return arg1.getDept().compareTo(arg2.getDept());
	}
}
