package com.exception;

import java.io.IOException;

public class UncheckedException {
	public static void main(String[] args) {
		
			try {
				System.out.println(UncheckedException.division(1,2));
			} catch (MyCustomException | IOException e) {
				e.printStackTrace();
			}
		System.out.println("Program Execurted Successfully");
	}	
	
	//throws and throw exception
	public static int division(int a, int b) throws IOException, MyCustomException{
		if(b==0) {
			throw new MyCustomException("Wrong Input passed. divisor should not be zero");
		}
		return a/b;
	}
}
