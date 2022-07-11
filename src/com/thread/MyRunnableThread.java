package com.thread;

public class MyRunnableThread implements Runnable{

	private String threadName;
	private int delay;	
	
	public MyRunnableThread(String threadName, int delay) {
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
}
