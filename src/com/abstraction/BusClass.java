package com.abstraction;

public class BusClass extends VehicleAbstractClass{

	@Override
	public void getEngine() {
		System.out.println("This is BUS Engine");		
	}

	@Override
	public void getWheels() {
		System.out.println("This is BUS having 6 tyres");		
	}
	
}
