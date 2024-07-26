import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import model.DataBase;

@Configuration
@ComponentScan(basePackages = {"model" , "controller"})
public class AppConfig {
	
	

}
