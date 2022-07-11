package com.inheritance.demo;

public class Gst implements TaxInterface,ServiceTaxInterface{
	
	public void calaculateTax(){
		System.out.println("You GST tax is :"+2500+" Rs.");
	}
}
