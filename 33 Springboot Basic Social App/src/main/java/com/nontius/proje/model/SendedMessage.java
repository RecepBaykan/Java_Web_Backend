package com.nontius.proje.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendedMessage {
	
	@Id
	@GeneratedValue (strategy =  GenerationType.UUID)
	private String id;
	
	@ManyToOne
	private User fromUser;
	
	@ManyToOne
	private User toUser;
	
	
	
	@Lob
	private String message;

}
