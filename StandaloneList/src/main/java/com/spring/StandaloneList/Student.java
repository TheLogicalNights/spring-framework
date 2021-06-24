package com.spring.StandaloneList;

import java.util.List;

public class Student 
{
	private List<String> subjects;

	public Student(List<String> subjects) 
	{
		this.subjects = subjects;
	}

	@Override
	public String toString() 
	
	{
		return "Student [subjects=" + subjects + "]";
	}
	
	
}
