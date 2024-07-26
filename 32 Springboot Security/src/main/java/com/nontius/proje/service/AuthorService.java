package com.nontius.proje.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.dto.AuthorBook;
import com.nontius.proje.dto.AuthorDTO;
import com.nontius.proje.dto.BookDTO;
import com.nontius.proje.model.Author;
import com.nontius.proje.model.Book;
import com.nontius.proje.repository.AuthorRepository;
import com.nontius.proje.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookService bookService;
	
	
	public Author findAuthor(String id) {
		
		return authorRepository.findById(id).get();
	}
	
	public List<Author> getAuthors(){
		return authorRepository.findAll();
	}
	
	
	public void saveAuthorBook(AuthorBook authorBook) {
		
		
		
		Author author = new Author();
		
		author.setName(authorBook.getName());
		author.setSurName(authorBook.getSurname());
		
		authorRepository.save(author);
		
		Book book = new Book();
		book.setName(authorBook.getBookname());
		book.setAuthor(author);
		
		bookService.save(book);
		
		
	}
	
	
	public List<Book> getBooks(String id){
		
	
		
		
		return findAuthor(id).getBooks();
		
	}
	
}
