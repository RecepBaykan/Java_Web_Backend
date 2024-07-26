package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.model.Personal;

@Configuration
public class AppConfig {
	
	@Bean(name = "personalBean")
	public Personal personal() {
		
		return new Personal();
	}
	

}
