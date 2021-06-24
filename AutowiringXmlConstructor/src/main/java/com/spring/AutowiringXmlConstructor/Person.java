package com.spring.AutowiringXmlConstructor;

public class Person 
{
	private MedicalInfo info;

	public Person(MedicalInfo info) {
		super();
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [info=" + info + "]";
	}

}
