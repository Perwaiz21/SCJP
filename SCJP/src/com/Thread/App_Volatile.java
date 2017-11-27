package com.Thread;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;
	volatile int counter = 1;

	public void run() {

		while (running) {
			// for (int i = 1; i < 10; i++) {

			System.out.println("Hello : " + counter);
			counter++;
			// }
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {

		running = false;
	}

}

public class App_Volatile {

	public static void main(String[] args) {

		Processor process = new Processor();
		process.start();

		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		process.shutDown();
		System.out.println("Please stop");
	}

}
