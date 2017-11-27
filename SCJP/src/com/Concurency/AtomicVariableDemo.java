package com.Concurency;

import java.util.concurrent.locks.ReentrantLock;

class Visit {

	public static long count = 0;
}

public class AtomicVariableDemo extends Thread {

	public void run() {

		/*
		 * synchronized (Visit.class) { Visit.count++;
		 * 
		 * System.out.println(Thread.currentThread().getName() + ": " +
		 * Visit.count + " "); }
		 */
		// Common method
		/*Visit.count++;

		System.out.println(Thread.currentThread().getName() + ": "
				+ Visit.count + " ");*/
		
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		try {
			counter();
		} finally{
		
			lock.unlock();
		}
		
	}

	public void counter(){
		
		Visit.count++;
		System.out.println(Thread.currentThread().getName() + ": "
				+ Visit.count + " ");
		
	}
	
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Thread t1 = new AtomicVariableDemo();
			Thread t2 = new AtomicVariableDemo();
			t1.start();
			t2.start();
		}

	}
}
