package com.inheritance.demo;

public class InnovaCar extends Vehicle{
	public Integer noOfAirBags;
	
	public void printNoOfAirBags(){
		System.out.println("The number of AirBags are :"+noOfAirBags);
	}
	
	public void getNoOfTyres(){
		System.out.println("InnovaCar : No of Tyres are :"+noOfTyres);
	}
}
