package com.spring.LifeCycleMethodsInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Animal animal = (Animal) context.getBean("animal");
    	
    	System.out.println(animal);
    	context.registerShutdownHook();
    }
}
