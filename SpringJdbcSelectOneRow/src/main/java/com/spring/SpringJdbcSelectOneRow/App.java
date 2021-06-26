package com.spring.SpringJdbcSelectOneRow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        student.rollNumber = 1;
        
        Student result = student.getStudent();
        
        System.out.println(result);
    }
}
