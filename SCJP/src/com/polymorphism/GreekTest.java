package com.polymorphism;

class Alpha {
	void m1() {

	}
}

class Beta extends Alpha {

	void m2() {

	}
}

class Gamma extends Beta {

	void m3() {

	}
}

public class GreekTest {

	public static void main(String[] args) {

		Alpha a[] = { new Alpha(), new Beta(), new Gamma() };
		for (Alpha a2 : a) {
			a2.m1();
			if ( a2 instanceof Beta || a2 instanceof Gamma) {
				//System.out.println("1");
				//((Beta)a2).m2();
				((Gamma)a2).m2();
			}
		}
	}

}
