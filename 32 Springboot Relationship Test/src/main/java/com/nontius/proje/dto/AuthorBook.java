package com.nontius.proje.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorBook {
	
	private String name;
	private String surname;
	private String bookname;

}
