package com.Immutable;

import java.util.Date;

public class Immu_Finale {

	public static void main(String[] args) {

		Immu_A imA = new Immu_A("Perwaiz", "Ali", "Mumbai");
		imA.setCity("Delhi");
		System.out.println(imA.getFname() + " "+ imA.getLname() +" " + imA.getCity());
		
		Immu_B imB = new Immu_B("Ravi", "KG", "Amasterdam");
		imB.setCity("DevGhar");
		System.out.println(imB.getFname() + " " + imB.getLname() + " "+ imB.getCity());
		
		Immutable_B immb = new Immutable_B("Vijay", "Tiwar", "Mumbai");
		
		System.out.println(immb.getFname()+ " "+ immb.getLname()+"  "+immb.getCity());
		
		Immutable_C immc = new Immutable_C("Chandu", "Kumawat", "OrangaBade", new Date());
		
		System.out.println(immc.getFname()+ " "+ immc.getLname()+" "+ immc.getCity()+" " + immc.getDate());
	}

}
