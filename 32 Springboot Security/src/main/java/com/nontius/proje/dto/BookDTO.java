package com.nontius.proje.dto;

import org.springframework.stereotype.Component;

import com.nontius.proje.model.Author;
import com.nontius.proje.model.Book;
import com.nontius.proje.model.TopicType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Component
@NoArgsConstructor
@AllArgsConstructor

public class BookDTO {

	private String id;
	private String name;
	private TopicType topicType;
	private String ISNB;
	private AuthorDTO author;
	

	
}
