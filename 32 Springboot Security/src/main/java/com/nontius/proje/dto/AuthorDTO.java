package com.nontius.proje.dto;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

	
	private String id;
	
	private String name;
	
	private String surName;
	
	
	private List<BookDTO> books;
}
