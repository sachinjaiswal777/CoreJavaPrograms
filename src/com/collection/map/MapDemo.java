package com.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new ConcurrentHashMap<>();
		map.put(2, "TWO");		
		map.put(1, "ONE");
		map.put(3, "THREE-A");
		map.put(3, "THREE-B");
		//System.out.println(map);
		
		for(Entry<Integer,String> singleObj:map.entrySet()){
			//System.out.println(singleObj.getKey()+" = "+singleObj.getValue());
		}
		
		for(Integer key : map.keySet()){
			//System.out.println(key);
			//System.out.println(map.get(key));
		}
		
		for(String val:map.values()){
			//System.out.println(val);
		}
		
		/*Iterator itr = map.keySet().iterator();		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Iterator valIterator = map.values().iterator();	
		while(valIterator.hasNext()){
			System.out.println(valIterator.next());
		}*/
		
		
		
		
		Map<Person,String> personMap = new TreeMap<>();
		personMap.put(new Person(1001,"Sachin"),"Sachin");
		personMap.put(new Person(1002,"Manju"),"Manju");
		personMap.put(new Person(1002,"Manju"),"Manju");
		personMap.put(new Person(1004,"B"),"B");
		personMap.put(new Person(1003,"A"),"A");
		
		//System.out.println(personMap);
		
		Map<Employee,String> employeeMap = new TreeMap<>(new PersonIdSorter());
		employeeMap.put(new Employee(1001,"Sachin",3000),"Sachin");
		employeeMap.put(new Employee(1002,"Manju",2000),"Manju");
		employeeMap.put(new Employee(1002,"Manju",2000),"Manju");
		employeeMap.put(new Employee(1004,"B",4000),"B");
		employeeMap.put(new Employee(1003,"A",5000),"A");
		//System.out.println(employeeMap);
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1001,"Sachin",3000,"IT"));
		empList.add(new Employee(1002,"Manju",5000,"IT"));
		empList.add(new Employee(1004,"B",4000,"CIVIL"));
		empList.add(new Employee(1003,"A",5000,"CIVIL"));
		Collections.sort(empList, new DeptSorter().thenComparing(new SalarySorter()));
		        
		System.out.println(empList);
	}
}
