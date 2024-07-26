package controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Book;

@RestController
@RequestMapping
public class LibraryController {

	@GetMapping("/succes.html")
	public String submintForm(@RequestParam(name = "ID") String id, @RequestParam(name = "bookName") String name,
			@RequestParam(name = "author") String author, @RequestParam(name = "ISBN") String ISBN

	) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLUpdate");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		Book book = new Book(id, name, author, ISBN);

		entityManager.persist(book);

		transaction.commit();

		System.err.println("Merhaba");

		return "succes";
	}
	
	
	
	@GetMapping("/guncelle")
	public String guncelle(@RequestParam(name = "ID") String id, @RequestParam(name = "bookName") String name,
			@RequestParam(name = "author") String author, @RequestParam(name = "ISBN") String ISBN

	) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLUpdate");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		Book bookTemp = new Book(id, name, author, ISBN);
		
		Book book = entityManager.find(Book.class, "id");
		
		book = bookTemp;

		entityManager.merge(book);

		transaction.commit();

	

		return "Kitap bilgileri güncellendi";
	}


	
	@GetMapping("/sorgula")
	public String bookFind(
			@RequestParam (name = "id") String id
			
			) {
			

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLUpdate");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Book book = entityManager.find(Book.class, id);
		
		if(book != null) {
			
			return book.toString();
		}else {
			return "kitap bulunamadı";
		}
		
			
		
		
	}
	
	
	
	@GetMapping("/sil")
	public String bookDelete(
			@RequestParam (name = "id") String id
			
			) {
			

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLUpdate");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Book book = entityManager.find(Book.class, id);
		
		if(book != null) {
			
			transaction.begin();
			
			entityManager.remove(book);
			transaction.commit();
			
			return "silindi";
		}else {
			return "kitap bulunamadı";
		}
		
			
		
		
	}
	
	
	
	

}
