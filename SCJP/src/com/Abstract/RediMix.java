package com.Abstract;

public class RediMix extends Concrete {

	RediMix() {
		System.out.println("RediMix");
	}
	public static void main(String[] args) {
		new RediMix();
		//Concrete concreteMix = new Concrete("Anil");
		Concrete concreteMix = new RediMix();
		RediMix concreteMixOne = (RediMix)new Concrete();
	}
}

class Concrete extends Sand {
	Concrete() {
		System.out.println("Concrete");
	}
	private Concrete(String str) {
	}
}

abstract class Sand {
	Sand() {
		System.out.println("Sand");
	}
}