package com.spring.LifeCycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = (Person)context.getBean("person");
        
        System.out.println(person);
        
        context.registerShutdownHook();	//Inform that destroy method is present in the bean and run it
    }
}
