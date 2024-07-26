package com.nontius.proje.dto;

import java.util.Date;

import com.nontius.proje.model.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
	
	private String id;
	private TransactionType transactionType;
	private Double amount;
	private Date transactionDate;
	private AccountDTO account;

}
