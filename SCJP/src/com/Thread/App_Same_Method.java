package com.Thread;

public class App_Same_Method {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			public void run() {

				for(int i=1;i<=10;i++){
					System.out.println("Hello :" + i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		});

		thread.start();
	}
}
