package com.Exception;

public class DemoCustomException {

	public static void main(String[] args) {

		DemoCustomException ce = new DemoCustomException();
		try {
			ce.testException(1);
		} catch (CustomException e) {
			System.out.println(e);
		}
	}

	public void testException(int i) throws CustomException {
		if (i == 1) {
			throw new CustomException("Invalid key pass");
		}
	}

}
