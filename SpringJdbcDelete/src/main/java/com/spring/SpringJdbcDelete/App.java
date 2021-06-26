package com.spring.SpringJdbcDelete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        student.rollNumber = 2;
        
        int iResult = student.delete();
        
        System.out.println(iResult+" Rows has been deleted...");
    }
}
