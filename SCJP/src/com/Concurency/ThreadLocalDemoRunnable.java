package com.Concurency;

public class ThreadLocalDemoRunnable implements Runnable {

	ThreadLocal<Integer> tlocal = new ThreadLocal<Integer>();
	
	@Override
	public void run() {
		
		

		System.out.println("Thread :"+ Thread.currentThread().getName());
		
	}

}
