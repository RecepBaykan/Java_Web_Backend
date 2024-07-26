package com.nontius.proje.dto;

import java.util.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

	private String id;
	private Double balance;
	private Date date;
	private CustomerDTO customer;
	private List<TransactionDTO> transactions;
	
}
	