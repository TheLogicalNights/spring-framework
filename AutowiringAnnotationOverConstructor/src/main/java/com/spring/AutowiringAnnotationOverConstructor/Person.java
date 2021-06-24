package com.spring.AutowiringAnnotationOverConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Person 
{
	private Address address;
	
	@Autowired
	public Person(Address address) 
	{
		super();
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Person [address=" + address + "]";
	}
}
