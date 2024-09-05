package com.nontius.proje.entityDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeaponDTO {
	
	private Long id;
	
	
	
	private String title;
	
	
	private String content;
	
	
	private String picture;
	
	

}
