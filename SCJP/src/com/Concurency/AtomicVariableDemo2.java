package com.Concurency;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicVariable {

	public static AtomicInteger count = new AtomicInteger();

}

public class AtomicVariableDemo2 extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName() + ":"
				+ AtomicVariable.count.incrementAndGet());

	}

	public static void main(String[] args) {

		for (int i = 0; i <5; i++) {
			Thread t1 = new AtomicVariableDemo2();
			Thread t2 = new AtomicVariableDemo2();
			t1.start();
			t2.start();
		}
	}

}
