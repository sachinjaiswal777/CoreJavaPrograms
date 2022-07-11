package com.collection.map;

import java.util.Comparator;

public class PersonIdSorter  implements Comparator<Employee>{
	
	@Override
	public int compare(Employee arg1, Employee arg2) {
		if(arg1.getId()>arg2.getId()){
			return 1;
		}else if(arg1.getId()<arg2.getId()){
			return -1;
		}
		return 0;
	}
}
