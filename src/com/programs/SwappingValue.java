package com.programs;

public class SwappingValue {
	
	public static void main(String[] args) {
		swap(2,3);
	}
	
	public static void swap(int a, int b){
		System.out.println("Before Swapping :: a="+a+",  b="+b);

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping :: a="+a+",  b="+b);
	}

}
