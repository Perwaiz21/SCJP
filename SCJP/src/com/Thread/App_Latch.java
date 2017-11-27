package com.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor_Latch implements Runnable{
	
	private CountDownLatch latch;
	public Processor_Latch(CountDownLatch latch){
		this.latch = latch;
	}
	
	public void run(){
		
		System.out.println("Started ....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
	}
}

public class App_Latch {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0; i<3; i++){
			executor.submit(new Processor_Latch(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed ....");
	}
}
