package com.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor_Executor implements Runnable {

	private int id;

	public Processor_Executor(int id) {

		this.id = id;
	}

	public void run() {

		System.out.println("Starting " + id);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Complete " + id);

	}
}

public class App_Executor {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor_Executor(i));
		}
		long Start = System.currentTimeMillis();
		System.out.println("All Task submitted ....");
		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All task completed.....");
		long End = System.currentTimeMillis();
		System.out.println("Complete Time : " + (End - Start));
	}

}
