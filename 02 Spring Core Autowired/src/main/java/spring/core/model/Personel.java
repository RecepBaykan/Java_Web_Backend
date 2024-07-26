package spring.core.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Personel {
	private String name;
	private String surname;
	private int age;
	
	@Autowired
	private Adress adress;

	
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
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Adress getAdress() {
		return adress;
	}
	
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
}
