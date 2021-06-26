package com.spring.SpringJdbcUpdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        student.rollNumber = 2;
        student.Name = "Aniket Chandrakant Dhole";
        student.division = "B";
        
        int iResult = student.update();
        
        System.out.println(iResult+" Row Updated successfully...");
    }
}
