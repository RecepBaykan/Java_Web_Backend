package model;

import java.util.List;
import java.util.Map;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;



@Embeddable
public class Contact {

	
	
	@ElementCollection (fetch = FetchType.LAZY) 
	private List<String> phoneNumber;
	
	@ElementCollection (fetch = FetchType.LAZY) 
	private Map<EmailType, String> email;
	private String link;
	
	
	private Contact() {
		
	}


	public Contact(List<String> phoneNumber, Map<EmailType, String> email, String link) {
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


	public Map<EmailType, String> getEmail() {
		return email;
	}


	public void setEmail(Map<EmailType, String> email) {
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
