package com.programs;

import java.util.ArrayList;
import java.util.List;

public class FindOddEvenNumber {	
	
	public static void main(String[] args) {
		int[] intArray = {1,4,2,6,7,8,9,2,10,13,11,12};
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]%2==0){
				evenList.add(intArray[i]);
			}else{
				oddList.add(intArray[i]);
			}
		}
		
		System.out.println("Odd List :"+oddList);
		System.out.println("Even List :"+evenList);
	}
}
