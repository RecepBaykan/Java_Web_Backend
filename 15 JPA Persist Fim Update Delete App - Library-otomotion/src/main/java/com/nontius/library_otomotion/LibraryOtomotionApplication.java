package com.nontius.library_otomotion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("controller")
public class LibraryOtomotionApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(LibraryOtomotionApplication.class, args);
	
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLUpdate");
		EntityManager entityManager = factory.createEntityManager();
		
	}
	
	
	
	
	

}
