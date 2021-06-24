package com.spring.AutowiringXmlConstructor;

public class MedicalInfo 
{
	private String bloodGroup;
	private float haemoglobin;
	
	public MedicalInfo(String bloodGroup, float haemoglobin) 
	{
		this.bloodGroup = bloodGroup;
		this.haemoglobin = haemoglobin;
	}
	
	@Override
	public String toString() {
		return "MedicalInfo [bloodGroup=" + bloodGroup + ", haemoglobin=" + haemoglobin + "]";
	}
}
