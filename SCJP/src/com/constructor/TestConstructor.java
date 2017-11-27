package com.constructor;

public class TestConstructor {

	static int count = 0;

	public TestConstructor() {
		while (count < 10)
			new TestConstructor(++count);
	}

	public TestConstructor(int x) {
		super();

	}

	public static void main(String[] args) {

		new TestConstructor();
		new TestConstructor(4);
		System.out.println(count++);
	}

}
