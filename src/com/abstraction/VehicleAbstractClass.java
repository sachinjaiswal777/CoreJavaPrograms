package com.abstraction;

public abstract class VehicleAbstractClass {
	Integer a;
	public abstract void getEngine();
	public abstract void getWheels();
	public void printName(){
		System.out.println("This is printName Method");
	}
	
	public void setA(Integer b){
		a=b;
	}
}
