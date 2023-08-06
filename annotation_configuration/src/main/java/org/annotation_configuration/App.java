package org.annotation_configuration;

import org.annotation_configuration.model.City;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	City city = (City) context.getBean(City.class);
    	
    	context.close();
    	
    	System.out.println(city);
    	
    	
    	
    }
}
