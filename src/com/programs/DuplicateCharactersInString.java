package com.programs;

public class DuplicateCharactersInString {
	
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
			
			if(counter>1){
				System.out.println(strArr[i]+" -> "+counter);
			}
		}
	}
}