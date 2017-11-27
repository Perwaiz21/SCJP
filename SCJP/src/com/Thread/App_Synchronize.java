package com.Thread;

public class App_Synchronize {

	private volatile int counter = 0;

	public static void main(String[] args) {

		App_Synchronize app_syn = new App_Synchronize();
		app_syn.doWork();

	}

	public synchronized int increment(){
		
		return counter++;
	}
	
	public void doWork() {

		Thread t_1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}

		});

		Thread t_2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}

		});

		
		t_1.start();
		t_2.start();
		
		try {
			t_1.join();
			t_2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(counter);
	}
}
