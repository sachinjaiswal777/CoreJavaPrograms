package com.inheritance.demo;

public class InheritanceDemo {
	public static void main(String[] args){
		InnovaCar ic = new InnovaCar();//Child ref = Child Obj
		ic.noOfTyres=4;
		ic.noOfAirBags=2;
		//ic.getNoOfTyres();
		//ic.printNoOfAirBags(); //Call child Class method
		
		Vehicle icTwo = new InnovaCar(); //Parent Ref  = child Obj
		icTwo.noOfTyres=6;
		//icTwo.getNoOfTyres();//Call child Class method
		
		//InnovaCar icThree = new Vehicle(); //Child ref = Parent obj
		//icTwo.noOfTyres=6;
		//icTwo.getNoOfTyres();
		
		Vehicle vc = new Vehicle(); //Parent ref = Parent Obj
		//vc.getNoOfTyres(); //Call Parent Class method
	
		Gst g1 = new Gst();
		g1.calaculateTax();
		
		//Loose Coupling
		TaxInterface g = new Gst();
		g.calaculateTax();
		
		TaxInterface v = new Vat();
		v.calaculateTax();
	}
}
