package com.accessmodifier;

public class AccessModifierTest {
	//private access specifier
	private Integer count;
	
	private Integer getCount(){
		return count;	
	}
	
	//default access specifier
	Integer num;
	
	Integer getNum(){
		return count;	
	}
	
	//protected access specifier
	protected Integer age;
	
	protected Integer getAge(){
		return count;	
	}
	
	//public access specifier
	public String name;
	
	public String getName(){
		return name;	
	}
	
	public static void main(String[] args) {
		AccessModifierTest ob = new AccessModifierTest();
		ob.getName();
		ob.name="ABC";
	}
}
