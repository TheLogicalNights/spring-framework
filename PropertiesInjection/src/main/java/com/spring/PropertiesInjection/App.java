package com.spring.PropertiesInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Laptop laptop = (Laptop) context.getBean("laptop");
        
        System.out.println(laptop.getModelNumber());
        System.out.println(laptop.getCompanyName());
        System.out.println(laptop.getSpecifications());
    }
}
