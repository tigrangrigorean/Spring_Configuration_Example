package org.java_configuration.config;

import org.java_configuration.model.City;
import org.java_configuration.model.ElectricStation;
import org.java_configuration.model.Libraries;
import org.java_configuration.model.SubwayStation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public ElectricStation electricStation() {
		return new ElectricStation();
	}
	
	@Bean
	public Libraries libraries() {
		return new Libraries();
	}
	
	@Bean
	public SubwayStation subwayStation() {
		return new SubwayStation();
	}
	
	@Bean
	public City city() {
		return new City(electricStation(),subwayStation(),libraries());
	}

}
