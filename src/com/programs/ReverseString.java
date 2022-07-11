package com.programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in); 
		String inputStr = scannerObj.nextLine();
		scannerObj.close();
		System.out.println(ReverseString.reverseString(inputStr));
	}
	
	public static String reverseString(String origString){
		String reverse ="";
		
		for(int i=origString.length()-1; i>=0;i--){
			reverse = reverse+origString.charAt(i);
		}	
		
		return reverse;		
	}
}
