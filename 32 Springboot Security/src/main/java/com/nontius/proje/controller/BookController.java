package com.nontius.proje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.model.Book;
import com.nontius.proje.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		
		return bookService.getBooks();
	}

}
