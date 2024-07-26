package model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	@Embedded private Contact contact;
	
	private Date birthOfDay;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String surname, Contact contact, Date birthOfDay) {
		super();
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.birthOfDay = birthOfDay;
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Date getBirthOfDay() {
		return birthOfDay;
	}

	public void setBirthOfDay(Date birthOfDay) {
		this.birthOfDay = birthOfDay;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", contact=" + contact + ", birthOfDay="
				+ birthOfDay + "]";
	}
	
	
	
	
	
}
