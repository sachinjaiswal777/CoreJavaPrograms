package com.collection.map;

import java.util.Comparator;

public class PersonNameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee arg1, Employee arg2) {
		return arg1.getName().compareTo(arg2.getName());
	}
}
