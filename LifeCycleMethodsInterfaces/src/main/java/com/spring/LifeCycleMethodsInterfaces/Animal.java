package com.spring.LifeCycleMethodsInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean,DisposableBean
{
	private String animalName;
	private String animalSound;
	
	public Animal(String animalName, String animalSound) 
	{
		System.out.println("Setting values");
		this.animalName = animalName;
		this.animalSound = animalSound;
	}

	@Override
	public String toString() 
	{
		return "Animal [animalName=" + animalName + ", animalSound=" + animalSound + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//this is init method
		System.out.println("Inside init method");
	}
	
	public void destroy() throws Exception {
		//inside destroy method
		System.out.println("Inside destroy method");
	}
}
