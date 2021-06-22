package com.spring.LifeCycleMethods;

public class Person 
{
	private int personId;
	private String personName;
	private long phoneNumber;
	
	public Person(int personId, String personName, long phoneNumber) 
	{
		System.out.println("Inside constructor");
		this.personId = personId;
		this.personName = personName;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
