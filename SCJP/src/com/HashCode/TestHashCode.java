package com.HashCode;

public class TestHashCode {
	
	int i =10;
	int num =17;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + num;
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
		TestHashCode other = (TestHashCode) obj;
		if (i != other.i)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		
	}

	
}
