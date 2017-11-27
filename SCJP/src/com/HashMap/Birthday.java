package com.HashMap;

import java.util.HashMap;

public class Birthday {

	public static void main(String[] args) {

		HashMap<Friends, String> hm = new HashMap();
		hm.put(new Friends("Ali"), "Noida");
		hm.put(new Friends("Vidushi"), "Indirapuram");
		hm.put(new Friends("Richa"), "Botanical");
		hm.put(new Friends("Ajay"), "Gurgaon");
		
		Friends f = new Friends(args[0]);
		//Friends fA = new Friends("dRUMER");
		System.out.println(hm.get(f));
		System.out.println(hm.size());
		
	}

}


class Friends{
	
	String name;
	Friends(String n){
		name = n;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friends other = (Friends) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}