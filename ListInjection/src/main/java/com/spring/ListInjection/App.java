package com.spring.ListInjection;

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
        Employee employee = (Employee) context.getBean("employee");
        
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpPhoneNo());
        System.out.println(employee.getEmpAddress());
    }
}
