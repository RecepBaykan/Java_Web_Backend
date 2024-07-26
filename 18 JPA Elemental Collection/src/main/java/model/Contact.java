package model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	
	@ElementCollection private List<String> phoneNumber;
	private String email;
	private String link;
	
	
	private Contact() {
		
	}


	public Contact(List<String> phoneNumber, String email, String link) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.link = link;
	}


	public List<String> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", email=" + email + ", link=" + link + "]";
	}
	
	
	
}
