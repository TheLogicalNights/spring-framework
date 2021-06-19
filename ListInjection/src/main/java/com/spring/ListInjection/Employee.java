package com.spring.ListInjection;

import java.util.*;

public class Employee 
{
	private int empId;
	private List<String> empPhoneNo;
	private List<String> empAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(List<String> empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public List<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(List<String> empAddress) {
		this.empAddress = empAddress;
	}
}
