package com.spring.StereoTypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("1")
	private int rollNumber;
	@Value("Swapnil Ramesh Adhav")
	private String Name;
	
	
	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	@Override
	public String toString() 
	{
		return "Student [rollNumber=" + rollNumber + ", Name=" + Name + "]";
	}
	
	
}
