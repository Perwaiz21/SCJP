package com.Static;

public class Go extends Game{

	Go(){
		super(s);
	}
	{
		s+="i";
	}
	
	public static void main(String[] args) {

		new Go();
		System.out.println(s);
	}

	static {
		s+="Sb";
	}
}

class Game{
	
	static String s = "-";
	String s2 = "s2";
	Game(String args){
		s+=args;
	}
		
}
