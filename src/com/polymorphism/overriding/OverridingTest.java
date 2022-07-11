package com.polymorphism.overriding;

import java.io.IOException;

public class OverridingTest {
	public static void main(String[] args) throws IOException {
		ParentClass parent = new ChildClass();
		parent.printMsg();

	}
	
	public static void main(Integer[] args) throws IOException {
		ParentClass parent = new ChildClass();
		parent.printMsg();

	}
	
	
	public static void main(Double[] args) throws IOException {
		ParentClass parent = new ChildClass();
		parent.printMsg();

	}

}
