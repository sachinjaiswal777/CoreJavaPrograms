package com.programs;

public class FindPalindrome {
	
	public static void main(String[] args) {
		String str = "11211";
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--){
			revStr = revStr+str.charAt(i);
		}
		
		if(str.equals(revStr)){
			System.out.println("Given String is Palindrome : "+str);
		}else{
			System.out.println("Given String is not a Palindrome : "+str);
		}
	}
}
