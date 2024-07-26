package com.nontius.proje.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	private Double balance;
	private Date createDate;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "customerID", nullable = false)
	private Customer customer;
	
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Transaction> transactions;
	
	
}
