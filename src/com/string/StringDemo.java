package com.string;

public class StringDemo {
	
	public static void main(String[] args){
		
		String s1 = "Sachin";
		System.out.println(s1);
		s1 = "Satyam";
		System.out.println(s1);
		String s2 = s1;
		System.out.println(s2);
		System.out.println(s1==s2);
		s2 = "Kriti";
		System.out.println(s1==s2);
		String s3 = "Kriti";
		System.out.println(s2==s3);
		
		String s4 = new String("Prathmesh"); // Two Objects 1 in Heap Memory + 1 in String Pool
		String s5 = "Prathmesh";	//Single Obj in String pool	
		String s6 = s4;
		System.out.println(s4==s5); //false
		System.out.println(s4==s6); //true
		
		System.out.println("************************");
		String s7 = "Manju";		
		System.out.println(s7);
		s7 = s7.concat(" Ambade");		
		System.out.println(s7);
		
		String s8 ="ABC" +"DEF";
		
		System.out.println("**********StringBuilder and StringBuffer Demo**************");
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(sb);
		sb.append("Java");//now original string is changed
		System.out.println(sb);
		
		String country ="INDIA";
		StringBuffer sbuff = new StringBuffer("Welcome ");
		System.out.println(sbuff);
		sbuff.append("to "+country);//now original string is changed
		System.out.println(sbuff);
	}
}
