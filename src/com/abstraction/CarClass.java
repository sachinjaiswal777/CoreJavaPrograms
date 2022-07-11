package com.abstraction;

public class CarClass extends VehicleAbstractClass{

	@Override
	public void getEngine() {
		System.out.println("This is Car Engine");		
	}

	@Override
	public void getWheels() {
		System.out.println("Car is having 4 wheeels");			
	}

}
