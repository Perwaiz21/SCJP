package com.Try_Catch;

public class FinallyTest {

	public static void main(String[] args) {

		int num =100;
		try{
			
			System.out.println("Number : " + num);
			System.exit(num);
			if(num==100){
			//	return 100;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally run ");
		}
		
	}

}
