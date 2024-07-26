package com.nontius.proje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.model.Book;
import com.nontius.proje.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public void save(Book book) {
		
		bookRepository.save(book);
	}
	
	
	
}
