package org.xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml_configuration.model.City;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        City city = (City) context.getBean("city");
        
        context.close();
        
        System.out.println(city);
    }
}
