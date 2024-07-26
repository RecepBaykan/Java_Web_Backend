package com.nontius.proje.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.UUID)
	private String id;
	
	private String username;
	
	private String password;
	
	@ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Chat> chat;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Message> messages;
	
	
	
	
	
	
	
	
	

}
