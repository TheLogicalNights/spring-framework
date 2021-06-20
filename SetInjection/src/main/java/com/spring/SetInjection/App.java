package com.spring.SetInjection;

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
        Student student = (Student) context.getBean("student");
        
        System.out.println(student.getStudentRollNo());
        System.out.println(student.getStudentName());
        System.out.println(student.getSubjects());
    }
}
