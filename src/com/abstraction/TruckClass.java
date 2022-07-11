package com.abstraction;

public class TruckClass implements VehicleInterface{

	@Override
	public void getEngine() {
		System.out.println("This is a Truck Engine");		
	}

	@Override
	public void getWheels() {
		System.out.println("Truck is having 6 wheels");				
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
	}

}
