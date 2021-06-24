package com.spring.StandAloneSet;

import java.util.Set;

public class Student 
{
	private Set<String> phoneNumbers;

	public Student(Set<String> phoneNumbers) {
		super();
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Student [phoneNumbers=" + phoneNumbers + "]";
	}
}
