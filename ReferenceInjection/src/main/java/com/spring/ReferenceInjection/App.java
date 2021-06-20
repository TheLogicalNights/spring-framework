package com.spring.ReferenceInjection;

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
        A aref = (A) context.getBean("aref");
        
        System.out.println(aref.getX());
        System.out.println(aref.getbRef().getY());
    }
}
