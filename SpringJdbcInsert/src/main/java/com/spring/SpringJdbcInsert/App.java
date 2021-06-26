package com.spring.SpringJdbcInsert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student student = (Student) context.getBean("student");
        student.rollNumber = 2;
        student.Name = "Swapnil Ramesh Adhav";
        student.division = "A";
        
        Studentoperations studentOperations = (Studentoperations) context.getBean("studentop");
        int iResult = studentOperations.insert(student);
        System.out.println(iResult+" Record inserted successfully");
    }
}
