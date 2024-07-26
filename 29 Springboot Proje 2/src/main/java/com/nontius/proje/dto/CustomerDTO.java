package com.nontius.proje.dto;


import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

	private String id;
	private String name;
	private String surname;
	private List<AccountDTO> accounts;
}
