package com.spring.ConstructorInjection3;

public class Employee 
{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
}
