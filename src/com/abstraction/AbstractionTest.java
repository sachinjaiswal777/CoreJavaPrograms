package com.abstraction;

public class AbstractionTest {
	public static void main(String[] args) {
		//BusClass bs = new BusClass();//Tight Coupling
		//CarClass cc = new CarClass();
		
		VehicleAbstractClass bc = FactoryClass.getObject(); //Loose Coupling
		bc.getEngine();
		bc.getWheels();
		bc.a=100;
		bc.printName();
		
		VehicleInterface tc =  new TruckClass();
		//tc.getEngine();
		//tc.getWheels();

	}

}
