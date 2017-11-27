package com.Over2;

import com.Over1.A;

public class B extends C {

	@Override
	public void Test() {

		System.out.println("Test calling from B");
	}

	public static void main(String[] args) {

		B b = new B();
		A a = new A();
		A ab = new B();
		C c = new C();
		C ac = (C) new A();
		b.Test();
		b.Test2(3);
		a.Test();
		a.Test2(5);
		ab.Test();
		ab.Test2(34);
		c.Test();
		c.Test2(45);
		ac.Test();
		ac.Test2(90);
	}

}
