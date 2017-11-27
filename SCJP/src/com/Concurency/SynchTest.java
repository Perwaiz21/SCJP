package com.Concurency;

public class SynchTest {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				try {
					Thread.sleep(1000);
					processOne();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				try {
					Thread.sleep(1000);
					processTwo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
	}

	public static void processOne() {

		//processTwo();
		System.out.println("Ali-One");
	}

	public static void processTwo() {

		processOne();
		System.out.println("Ali-Two");
	}
}
