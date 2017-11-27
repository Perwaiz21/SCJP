package com.Thread;

class Mosey implements Runnable{
	
	public void run(){
		for (int i =0;i<=1000;i++){
			System.out.println(Thread.currentThread().getId()+"-"+i);
		}
	}
}

public class Stroll {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Mosey());
		t1.setPriority(5);
		t1.start();
		new Mosey().run();
	}

}
