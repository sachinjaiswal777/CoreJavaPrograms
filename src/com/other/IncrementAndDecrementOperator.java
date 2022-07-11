package com.other;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int a = 0;
		System.out.println(a++); //0   -> postfix operation
		System.out.println(a); //1
		int res = 5*a++;
		System.out.println(res); //5
		System.out.println(a); //2
		
		System.out.println("***************");
		int b = 0;
		System.out.println(++b); //1  --> prefix operation
		int res2 = 5*++b;
		System.out.println(res2); //10
		
		System.out.println("***************");
		int c = 5;
		System.out.println(c--); //5
		System.out.println(c); //4
		int res3 = 5*c--;
		System.out.println(res3); //20
		
		
		System.out.println("***************");
		int d = 5;
		System.out.println(--d); //4
		System.out.println(d); //4
		int res4 = 5*--d;
		System.out.println(res4); //15
		
		System.out.println("***************");
		int e = 5;
		System.out.println(-e);	//-5
		System.out.println(+e);	//5
	}

}
