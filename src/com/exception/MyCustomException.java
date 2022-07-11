package com.exception;

public class MyCustomException extends Exception{
	
	public MyCustomException() {
		System.out.println("MyCustomException occured");
	}
	
	public MyCustomException(String message) {
		super(message);
	}
}
