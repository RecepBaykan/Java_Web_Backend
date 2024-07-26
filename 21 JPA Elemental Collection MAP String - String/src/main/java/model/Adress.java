package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {

	private String street;
	private String city;
	private String postalCode;
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Adress(String street, String city, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}



	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
