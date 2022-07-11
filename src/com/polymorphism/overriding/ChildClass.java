package com.polymorphism.overriding;

import java.io.FileNotFoundException;


public class ChildClass extends ParentClass{
	
	@Override
	public Car printMsg() throws FileNotFoundException{
		System.out.println("ChildClass::printMsg - Hello....");
		return null;
	}

}
