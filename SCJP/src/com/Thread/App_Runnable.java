package com.Thread;

class Runner_Runnable implements Runnable{
	
	public void run(){
		
		for(int i=1; i<=10; i++){
			
			System.out.println("Hello :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App_Runnable {

	public static void main(String[] args) {

		Thread th_1 = new Thread(new Runner_Runnable());
		th_1.start();
		
		
	}

}
