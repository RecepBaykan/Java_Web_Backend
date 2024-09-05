package com.nontius.proje.mapper;


import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;

public class PatchMapper {
	
	public static Patch DTO_to_model(PatchDTO dto) {
		
		return Patch.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.content(dto.getContent())
					.date(dto.getDate())
					.picture(dto.getPicture())
				.build();
	}
	
	
	public static PatchDTO model_to_DTO(Patch model) {
		
		return PatchDTO.builder()
				.id(model.getId())
				.title(model.getTitle())
				.content(model.getContent())
				.date(model.getDate())
				.picture(model.getPicture())
				.build();
	}

}
