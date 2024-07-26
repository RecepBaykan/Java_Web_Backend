package com.nontius.proje.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SendMessege {
	
	private String fromUser;
	
	private List<String> toUsers;
	
	private String message;

}
