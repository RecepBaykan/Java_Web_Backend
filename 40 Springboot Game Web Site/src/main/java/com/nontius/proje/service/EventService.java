package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.nontius.proje.entityDTO.EventDTO;


@Service
public interface EventService {

	EventDTO getModel(Long id);
	
	List<EventDTO> getAll(); 
	
	EventDTO createModel(EventDTO modelDTO);
	
	void delete(Long id);
	
	EventDTO updateModel(Long id, EventDTO modelDTO);
	
	
}
