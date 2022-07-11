package com.collection.set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		//set.add(null);
		set.add("D");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("A");
		//set.add(null);
		
		//System.out.println(set);
		

		
		for(String str : set){
			//System.out.println(str);
		}
		//**********************
		
		/*Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			//System.out.println(itr.next());
		}*/
		
		/*Enumeration iter =Collections.enumeration(set);
		while(iter.hasMoreElements()){
			//System.out.println(iter.nextElement());
		}*/
		
		Set<Integer> intSet = new TreeSet<Integer>();
		intSet.add(4);
		intSet.add(1);
		intSet.add(3);
		intSet.add(5);
		intSet.add(2);
		System.out.println(intSet);

	}
}
