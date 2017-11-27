package com.Exception;

class ExceptionSubClassParent{
	
	public void exception(){
		System.out.println("Exceptions");
	}

}


public class ExceptionSubClass extends ExceptionSubClassParent {
	
	public void exception() throws Exception
	{
		System.out.println("Sub-Class");
	}
}

