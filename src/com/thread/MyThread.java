package com.thread;

public class MyThread extends Thread{
	
	private String threadName;
	private int delay;	
	
	public MyThread(String threadName, int delay) {
		this.threadName = threadName;
		this.delay = delay;
	}
	

	@Override
	public void run() {
		System.out.println("MyThread Started = "+threadName);
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("MyThread End = "+threadName);
	}
	
	public static void main(String[] args) {
		MyThread threadOne = new MyThread("ThreadOne",4000); //New
		threadOne.start(); //Runnable
		threadOne.setPriority(1);
		
		MyThread threadTwo = new MyThread("ThreadTwo",7000); //New
		threadTwo.start(); //Runnable
		threadTwo.setPriority(10);
		
		MyThread threadThree = new MyThread("threadThree",2000); //New
		threadThree.start(); //Runnable
		threadThree.setPriority(9);
	}
}
