package com.anudip.SpringProjectDemo;

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
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("Config.xml");
    	
    	Vehicle obj = (Vehicle) con.getBean("vehicle");
    	obj.drive();
        System.out.println( "Hello World!" );
    }
}
