package com.nontius.proje.serviceImpl;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Event;

import com.nontius.proje.entityDTO.EventDTO;

import com.nontius.proje.exception.EventNotFound;

import com.nontius.proje.mapper.EventMapper;

import com.nontius.proje.repository.EventRepository;

import com.nontius.proje.service.EventService;

@Service
public class EventServiceImpl implements EventService {
	

	private final EventRepository repository;
	
	public EventServiceImpl(EventRepository repository) {
		
		this.repository = repository;
	
}

	
	@Override
	public EventDTO getModel(Long id) {
		Event model = repository.findById(id).orElseThrow(() -> new EventNotFound("Not found"));
		
		
		return EventMapper.model_to_DTO(model);
	}


	@Override
	public List<EventDTO> getAll() {

		List<Event> models = repository.findAll();
		

		// TODO Auto-generated method stub
		return models.stream().map(
			
			(model) -> EventMapper.model_to_DTO(model)

		).collect(Collectors.toList());
	}
	
	@Override
	public EventDTO createModel(EventDTO modelDTO) {
		// TODO Auto-generated method stub
		Event model = EventMapper.DTO_to_model(modelDTO);
		model.setDate(LocalDate.now());
		
		Event saved = repository.save(model);
		
		return EventMapper.model_to_DTO(saved);
	}
	
	@Override
	public void delete(Long id) {

		Event model = repository.findById(id).orElseThrow(() -> new EventNotFound("Not found"));
		repository.delete(model);
	}
	
	
	@Override
	public EventDTO updateModel(Long id, EventDTO modelDTO) {
		Event model = repository.findById(id).orElseThrow(
				() -> new EventNotFound("Not found content by id: " + id)
				);
		
		model.setTitle(modelDTO.getTitle());
		model.setContent(modelDTO.getContent());
		model.setPicture(modelDTO.getPicture());
		
	
	
		Event saved = repository.save(model);
		
		
		
		return EventMapper.model_to_DTO(saved);
	}
}
