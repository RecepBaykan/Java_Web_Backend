package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Student")
public class Student {
	
	@Id
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String surname;

	public Student(String id, String name, String surname) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}

}
