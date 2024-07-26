package com.nontius.proje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.dto.AuthorBook;
import com.nontius.proje.model.Book;
import com.nontius.proje.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/save")
	public String save(@RequestBody AuthorBook authorBook) {
		
		
		authorService.saveAuthorBook(authorBook);
		
		return "işlendi";
		
	}
	
	@GetMapping("getBooks")
	public List<Book> getBooks(@RequestParam("id") String id){
		
		
		return authorService.getBooks(id);
		
	}
	
}
