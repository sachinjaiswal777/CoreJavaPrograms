package com.other;

import java.util.Scanner;

public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in); 
		
		
		System.out.println("Enter your first name");
		String firstName = scannerObj.nextLine();
		
		
		System.out.println("Enter your last name");
		String lastName = scannerObj.nextLine();
		
		
		System.out.println("Welcome : "+firstName+" "+lastName);
		scannerObj.close();
	}

}
