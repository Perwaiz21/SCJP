package com.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App_Worker_Lock {

	public void calulate() {

		System.out.println("Starting .....");
		long start_time = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				process();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				process();
			}
		});

		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end_time = System.currentTimeMillis();

		System.out.println("Time Taken : " + (end_time - start_time));
		System.out.println("List_1 size :" + list_1.size() + "  "
				+ "List_2 size : " + list_2.size());
	}

	private List<Integer> list_1 = new ArrayList<Integer>();
	private List<Integer> list_2 = new ArrayList<Integer>();
	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void stageOne() {

		synchronized(lock1){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list_1.add(random.nextInt());
		}
		
	}

	public synchronized void stageTwo() {

		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list_2.add(random.nextInt());	
		}
		
	}

	public void process() {

		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
}
