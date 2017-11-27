package com.Thread.Concurent;

class ThreadTestA implements Runnable{
	
	public void run(){
		
		System.out.println("Hi");
		int a = 10;
		int b = 0;
		int c;
		try {
			 c =a/b;
			 System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadTestA());
		t1.start();
	}

}
