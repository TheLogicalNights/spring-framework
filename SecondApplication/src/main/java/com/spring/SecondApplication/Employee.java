package com.spring.SecondApplication;

public class Employee 
{
	private int empId;
	private String empName;
	private String empDesignation;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		System.out.println("Setting employee id");
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Setting employee name");
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		System.out.println("Setting employee designation");
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + "]";
	}
}
