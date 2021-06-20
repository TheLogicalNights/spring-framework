package com.spring.PropertiesInjection;

import java.util.Properties;

public class Laptop 
{
	private long modelNumber;
	private String companyName;
	private Properties specifications;
	
	public long getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(long modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Properties getSpecifications() {
		return specifications;
	}
	public void setSpecifications(Properties specifications) {
		this.specifications = specifications;
	}	
}
