package com.other;

public final class FinalKeyordDemo {

	public static void main(String[] args) {
		final Double pi;
		pi = 3.14;
	}
	
	public final void print(){
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
