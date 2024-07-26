package com.nontius.proje.DTO;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
	
	
	private String id;
	
	private String name;
	
	private String desc;
	
	private String imgUrl;
	
	private String gameURL;
}
