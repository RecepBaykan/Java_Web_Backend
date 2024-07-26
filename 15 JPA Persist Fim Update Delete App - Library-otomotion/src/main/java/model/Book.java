package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {

	@Id private String id;
	private String name;
	private String author;
	private String ISNB;
	
	
	
	public Book() {
		
	}
	
	
	
	public Book(String id, String name, String author, String iSNB) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		ISNB = iSNB;
	
	}





	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISNB() {
		return ISNB;
	}
	public void setISNB(String iSNB) {
		ISNB = iSNB;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", ISNB=" + ISNB + "]";
	}


	
	
	
	
	
	
	
}
