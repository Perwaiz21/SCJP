package com.Exception.Runtime;

public class DemoRunTimeException {
	
	public static void main(String[] args) {

		DemoRunTimeException dre = new DemoRunTimeException();
		try{
			dre.testRunTime(3);
		}
		
		catch(RunTimeExceptionOnRunTime e){
			System.out.println(e);
		}
		
		catch(RuntimeException e){
			e.getMessage();
			System.out.print(e);
			e.printStackTrace();
		}
	}
	
	public void testRunTime(int i){
		
		if(i==3){
			throw new RunTimeExceptionOnRunTime("Wrong number");
		}else{
			System.out.println("Its not 3.");
		}
	}

}
