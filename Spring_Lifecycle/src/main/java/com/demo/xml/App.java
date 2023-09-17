package com.demo.xml;

import org.springframework.context.ApplicationContext;

 import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.xml.Student;


public class App 
{
    public static void main( String[] args )
    {
          AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/demo/xml/config.xml");
    	context.registerShutdownHook();
    	Student s1=context.getBean("st2",Student.class);
    	
    	System.out.println(s1);
}
}