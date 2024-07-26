package com.nontius.proje.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {

	@Id
	@GeneratedValue (strategy = GenerationType.UUID)
	private String id;
	
	private String name;
	
	private TopicType topicType;
	
	private String ISNB;
	

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	
	
	
}
