package com.programs;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfCharacter {
	public static void main(String[] args) {
		String str = "aaabbc";
		
		char[] strArr = str.toCharArray();//{'b','n','m'}
		
		for(int i=0;i<strArr.length;i++){
			int counter =1;
			for(int j=i+1;j<strArr.length;j++){
				if(strArr[i]==strArr[j] && strArr[j]!='#'){
					counter++;
					strArr[j]='#';
				}
			}
			
			if(strArr[i]!='#'){
				System.out.println(strArr[i]+" -> "+counter);
			}
		}
		
		findFrequecyOfCharUsingMap(str);
	}
	
	
	public static void findFrequecyOfCharUsingMap(String str){
		Map<String,Integer> charCountMap = new HashMap<>();
		for(int i=0;i<str.length();i++){
			if(charCountMap.containsKey(String.valueOf(str.charAt(i)))){
				int counter = charCountMap.get(String.valueOf(str.charAt(i)));
				counter++;
				charCountMap.put(String.valueOf(str.charAt(i)), counter);
			}else{
				charCountMap.put(String.valueOf(str.charAt(i)), 1);
			}		
		}
		System.out.println(charCountMap);
	}
}
