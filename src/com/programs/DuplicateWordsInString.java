package com.programs;

public class DuplicateWordsInString {
	public static void main(String[] args) {
		String str = "Hi How are you , Are you coming today. Where are you";
		
		String[] strArr = str.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			int counter = 1;
			for(int j=i+1;j<strArr.length;j++){
				if(strArr[i].equalsIgnoreCase(strArr[j]) && !strArr[i].equals("#")){
					counter++;
					strArr[j]="#";
				}
			}
			
			if(counter>1){
				System.out.println(strArr[i]+" -> "+counter);
			}
		}
	}
}
