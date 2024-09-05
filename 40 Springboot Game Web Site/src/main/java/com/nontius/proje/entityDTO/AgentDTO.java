package com.nontius.proje.entityDTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentDTO {
	

	private Long id;
	
	private String name;
	private String info;
	
	private List<String> titleSkill;
	private List<String> descSkill;
	
	
	private String pictureLitle;
	
	
	private String pictureFull;

}
