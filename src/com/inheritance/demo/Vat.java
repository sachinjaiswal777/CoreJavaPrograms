package com.inheritance.demo;

public class Vat implements TaxInterface{

	@Override
	public void calaculateTax() {
		System.out.print("Your VAT tax is "+1500+" Rs.");		
	}

}
