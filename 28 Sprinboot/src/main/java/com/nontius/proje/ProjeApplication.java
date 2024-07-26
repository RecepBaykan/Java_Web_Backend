package com.nontius.proje;

import java.util.ArrayList;
import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nontius.proje.model.TestModel;
import com.nontius.proje.model.TestModel2;
import com.nontius.proje.service.TestModelService;

@SpringBootApplication
public class ProjeApplication{



	public static void main(String[] args) {
		SpringApplication.run(ProjeApplication.class, args);
	}

	

}
