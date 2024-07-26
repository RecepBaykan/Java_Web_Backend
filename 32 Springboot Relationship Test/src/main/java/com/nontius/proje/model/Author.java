	package com.nontius.proje.model;

	import java.util.List;

	import com.fasterxml.jackson.annotation.JsonIgnore;

	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.FetchType;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Author {

		@Id
		@GeneratedValue (strategy = GenerationType.UUID)
		private String id;
		
		private String name;
		
		private String surName;
		
		@OneToMany (mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JsonIgnore
		private List<Book> books;
	}
