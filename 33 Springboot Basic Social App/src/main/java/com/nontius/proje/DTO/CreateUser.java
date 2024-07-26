package com.nontius.proje.DTO;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUser {
	
	
	private String username;
	private String password;
	
	
	

}
