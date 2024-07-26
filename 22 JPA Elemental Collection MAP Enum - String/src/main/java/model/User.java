package model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.AttributeOverrides;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	@Embedded
	private Contact contact;

	@Embedded
	@ElementCollection (fetch = FetchType.LAZY) 
	private List<Adress> adress;

	private Date birthOfDay;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String surname, Contact contact, List<Adress> adress, Date birthOfDay) {
		super();

		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.adress = adress;
		this.birthOfDay = birthOfDay;
	}

	public List<Adress> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress> adress) {
		this.adress = adress;
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
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", contact=" + contact + ", adress="
				+ adress + ", birthOfDay=" + birthOfDay + "]";
	}

}
