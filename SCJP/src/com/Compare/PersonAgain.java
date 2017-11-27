package com.Compare;

class PersonAgain implements Comparable {

	  private String firstName;
	  private String lastName;
	  private int age;
	  
	  public PersonAgain(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public int compareTo(Object anotherPerson) throws ClassCastException {
	    if (!(anotherPerson instanceof PersonAgain))
	      throw new ClassCastException("A Person object expected.");
	    int anotherPersonAge = ((PersonAgain) anotherPerson).getAge();  
	    return this.age - anotherPersonAge;    
	  }
	  
	  
	  
	  
	 /* @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
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
		PersonAgain other = (PersonAgain) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
*/
	@Override
	public String toString() {
		return "PersonAgain [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
	  
	  
	}