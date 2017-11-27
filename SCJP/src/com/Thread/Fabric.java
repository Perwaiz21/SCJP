package com.Thread;

public class Fabric extends Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Fabric());
		Thread t2 = new Thread(new Fabric());
		t1.start();
		t2.start();
	}

	public void run() {
		for (int i = 0; i < 2; i++)
			System.out.println(Thread.currentThread().getName() + " ");
	}
}