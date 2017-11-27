package com.Concurency;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args) {

		final ReentrantLock lock = new ReentrantLock();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				lock.lock();
				for(int i=1; i<=10; i++){
					System.out.println(Thread.currentThread().getName());
				}
				lock.unlock();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				lock.lock();
				for(int i=1; i<=10; i++){
					System.out.println(Thread.currentThread().getName());
				}
				lock.unlock();
			}
		});

		//lock.lock();
		try {
			t1.start();
			t2.start();
		} finally {
			//lock.unlock();
		}
		
		
	}

}
