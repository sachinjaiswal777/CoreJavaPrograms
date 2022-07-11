package com.polymorphism.overloading;

public class AdditionOverloading {
	public void addition(Integer a,Integer b){
		System.out.println("11 Two Digit Sum = "+(a+b));
	}
	
	public void addition(int a,int b){
		System.out.println("11-int-int Two Digit Sum = "+(a+b));
	}
	
	public void addition(int a,float b){
		System.out.println("11-int-float Two Digit Sum = "+(a+b));
	}
	
	public void addition(int a,Integer b){
		System.out.println("11-int-Integer Two Digit Sum = "+(a+b));
	}
	
	public void addition(Integer a,int b){
		System.out.println("11-Integer-int Two Digit Sum = "+(a+b));
	}
	
	public void addition(Double a,Integer b){
		System.out.println("22 Two Digit Sum = "+(a+b));
	}
	
	public void addition(Double a,Double b){
		System.out.println("33 Two Digit Sum = "+(a+b));
	}
	
	public void addition(Integer a,Integer b, Integer c){
		System.out.println("Three Digit Sum = "+a+b+c);
	}
	
	public void addition(Integer a,Integer b, Integer c,Integer d){
		System.out.println("Four Digit Sum = "+a+b+c+d);
	}
		
	
	public void printMsg(Object s){
		System.out.println("Object::"+s);
	}
	
	public void printMsg(String s){
		System.out.println("String::"+s);
	}
	
	public static void main(String[] args) {
		AdditionOverloading obj = new AdditionOverloading();
		obj.addition(1, 2);
		//obj.addition(1d, 2d);
		//obj.addition(1d, 2);
		obj.printMsg(null);
	}
}
