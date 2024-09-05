package com.nontius.proje.mapper;


import com.nontius.proje.entity.Event;
import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.EventDTO;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;

public class EventMapper {
	
	public static Event DTO_to_model(EventDTO dto) {
		
		return Event.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.content(dto.getContent())
					.date(dto.getDate())
					.picture(dto.getPicture())
				.build();
	}
	
	
	public static EventDTO model_to_DTO(Event model) {
		
		return EventDTO.builder()
				.id(model.getId())
				.title(model.getTitle())
				.content(model.getContent())
				.date(model.getDate())
				.picture(model.getPicture())
				.build();
	}

}
