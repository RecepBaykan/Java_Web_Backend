import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import model.DataBase;

@Configuration
@ComponentScan(basePackages = {"model" , "controller"})
@EnableAspectJAutoProxy
public class AppConfig {
	
	

}
