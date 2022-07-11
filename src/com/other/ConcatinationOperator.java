package com.other;

public class ConcatinationOperator {

	public static void main(String[] args) {
		String str = "Sachin";
		str = str+" Tendulkar"+" Mumbai";
		System.out.println(str);
		str.concat(" India");
		System.out.println(str);
		
		int sum = 3+4;
		System.out.println(sum);
		
		System.out.println(1+2+"abc"); //3abc
		System.out.println("abc"+1+2); //abc12
		System.out.println(1+2+"abc"+3+4);//3abc34
	}

}
