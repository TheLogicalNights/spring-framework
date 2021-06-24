package com.spring.AutowiringAnnotationOverProperty;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	@Autowired
	private Address address;

	public Student(Address address) 
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Student [address=" + address + "]";
	}
	
	
}
