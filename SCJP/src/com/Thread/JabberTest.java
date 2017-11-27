package com.Thread;

public class JabberTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
		Jabber jab_1 = new Jabber("Hello");
		Jabber jab_2 = new Jabber("Hello Again");
		Thread t1 = new Thread(jab_1);
		Thread t2 = new Thread(jab_2);
 		t1.start();
 		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 		t1.stop();
 		t2.start();
	}

}

class Jabber implements Runnable {

	String str;

	public Jabber(String s) {
		str = s;
	}

	public void run() {
		while (true) {
			System.out.println(str);
		}
	}

}