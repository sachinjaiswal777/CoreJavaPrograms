package com.abstraction;

public class FactoryClass {
	
	public static CarClass getObject(){
		CarClass bc= new CarClass();
		return bc;
	}
}
