package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;

@Entity
public class Book {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	
	private String topic;
	
	private String author;
	
	private Date date;

	public Book(String name, String topic, String author, Date date) {
		
		
		this.name = name;
		this.topic = topic;
		this.author = author;
		this.date = date;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", topic=" + topic + ", author=" + author + ", date=" + date + "]";
	}
	
	
}
