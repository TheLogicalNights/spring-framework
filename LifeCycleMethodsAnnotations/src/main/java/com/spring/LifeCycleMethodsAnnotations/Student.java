package com.spring.LifeCycleMethodsAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student 
{
	private int studentRollNo;
	private String studentName;
	
	public Student(int studentRollNo, String studentName) 
	{
		System.out.println("Setting Properties");
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
