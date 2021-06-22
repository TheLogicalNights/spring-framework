package com.spring.ConstructorInjection4;

public class Student 
{
	private int studentRollNo;
	private String studentName;
	private Address address;
	
	public Student(int studentRollNo, String studentName, Address address) 
	{
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", address=" + address
				+ "]";
	}

	
}
