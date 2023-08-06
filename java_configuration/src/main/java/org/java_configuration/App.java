package org.java_configuration;

import org.java_configuration.config.SpringConfig;
import org.java_configuration.model.City;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	City city = context.getBean(City.class);
    	
    	context.close();
    	
    	System.out.println(city);
    }
}
