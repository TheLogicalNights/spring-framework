package com.spring.ConstructorInjection2;

public class Student 
{
	private int rollNo;
	private String Name;
	private String studentDivision;
	public Student(int rollNo, String name, String studentDivision) 
	{
		this.rollNo = rollNo;
		Name = name;
		this.studentDivision = studentDivision;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", studentDivision=" + studentDivision + "]";
	}
}
