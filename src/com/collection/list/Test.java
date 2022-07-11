package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[10];
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); //0
		list.add(20); //1
		list.add(20); //2
		list.add(30); //3

		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list.contains(40));
		
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//***************************************** O(4)
		
		for(Integer no : list){
			System.out.println(no);
		}
		//**********************
		
		Enumeration iter =Collections.enumeration(list);
		while(iter.hasMoreElements()){
			System.out.println(iter.nextElement());
		}
		
		
		System.out.println("*****************Using ListIterator**********************");
		ListIterator<Integer> iter1 = list.listIterator();
		while(iter1.hasNext()){
			System.out.println(iter1.next());
		}
	}
}
