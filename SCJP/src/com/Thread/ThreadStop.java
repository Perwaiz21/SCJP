package com.Thread;

public class ThreadStop extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("Thread is calling I :"+ i);
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new ThreadStop());
		ThreadStop thSt = new ThreadStop();
		thSt.start();
		try {
			thSt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thSt.stop();
		//t1.start();
		//t1.stop();
	
	}

}
