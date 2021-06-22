package com.spring.ConstructorInjection4;

public class Address 
{
	private String district;
	private String state;
	private String country;
	private int pincode;
	
	public Address(String district, String state, String country, int pincode) 
	{
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ "]";
	}
}
