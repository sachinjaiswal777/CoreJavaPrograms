package com.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable runnable = new MyRunnableThread("Runnable", 5000);
		
		Thread threadOne = new Thread(runnable, "ThreadOne");
		threadOne.start();
		threadOne.setPriority(10);
		
		Thread threadTwo = new Thread(runnable, "threadTwo");
		threadTwo.start();
		
		
		Thread threadThree = new Thread(runnable, "threadThree");
		threadThree.start();
		System.out.println(threadThree.getName());
	}
}
