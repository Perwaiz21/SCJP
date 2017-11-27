package com.CopyConstructor;

public class CopyCons {

	public int i;

	public CopyCons(int i) {
		this.i = i;
		System.out.println(i);
	}
	
	public CopyCons(CopyCons ref){
		
		i = ref.i;
		System.out.println("Copy Cons value : "+ i);
	}
	
}
