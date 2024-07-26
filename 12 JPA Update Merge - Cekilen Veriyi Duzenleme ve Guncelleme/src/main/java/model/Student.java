package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import jakarta.persistence.Column;

@Entity
@Table
public class Student {

	@Id
	private String id;
	private String name;
	private String surname;

	@Temporal(TemporalType.DATE)
	private Date birthOfDay;

	@Lob
	private String about;
	@Transient
	private boolean isInSchool;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String surname, Date birthOfDay, String about, boolean isInSchool) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthOfDay = birthOfDay;
		this.about = about;
		this.isInSchool = isInSchool;
	}

	public Date getBirthOfDay() {
		return birthOfDay;
	}

	public void setBirthOfDay(Date birthOfDay) {
		this.birthOfDay = birthOfDay;
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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isInSchool() {
		return isInSchool;
	}

	public void setInSchool(boolean isInSchool) {
		this.isInSchool = isInSchool;
	}

	@Override
	public String toString() {
		return "Student [getBirthOfDay()=" + getBirthOfDay() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSurname()=" + getSurname() + ", getAbout()=" + getAbout() + ", isInSchool()=" + isInSchool()
				+ "]";
	}

}
