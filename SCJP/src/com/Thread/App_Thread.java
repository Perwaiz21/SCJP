package com.Thread;

class Runner extends Thread{
	
	public void run(){
		
		for(int i=1; i<=10; i++){
			System.out.println("Hello :" + i);
		}
	}
}

public class App_Thread {

	public static void main(String[] args) {

		Runner runner_1 = new Runner();
		runner_1.start();
		
	}

}
