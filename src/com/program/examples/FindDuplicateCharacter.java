package com.program.examples;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
	public static void main(String[] args){
		String str = "dfedfsfwrfdssvdsvsdferrew";

		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<str.length();i++){
			
			if(map.containsKey(String.valueOf(str.charAt(i)))){
				Integer count = map.get(String.valueOf(str.charAt(i)));
				count++;
				map.put(String.valueOf(str.charAt(i)), count);
			}else{
				map.put(String.valueOf(str.charAt(i)), 1);
			}
			
		}
		System.out.println(map);
	}
}
