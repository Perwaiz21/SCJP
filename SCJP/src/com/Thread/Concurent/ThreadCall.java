package com.Thread.Concurent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadCallTest implements Callable {
	
	int num;
	public ThreadCallTest(int num){
		this.num = num;
	}
	
	public Object call() throws Exception {
		
		//System.out.println("Call");
		
		return num;
	}
	
}

public class ThreadCall {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ThreadCallTest[] tct = {new ThreadCallTest(20), new ThreadCallTest(30) };
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(ThreadCallTest threadcalltest : tct){
			
			Future r = service.submit(threadcalltest);
			System.out.println(r.get());
		}
		service.shutdown();
		
	}

}
