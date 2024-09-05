package com.nontius.proje.serviceImpl;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Map;
import com.nontius.proje.entity.News;
import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.MapDTO;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;
import com.nontius.proje.exception.AgentNotFound;
import com.nontius.proje.exception.MapNotFound;
import com.nontius.proje.exception.NewsNotFound;
import com.nontius.proje.exception.PatchNotFound;
import com.nontius.proje.mapper.MapMapper;
import com.nontius.proje.mapper.NewsMapper;
import com.nontius.proje.mapper.PatchMapper;
import com.nontius.proje.repository.MapRepository;
import com.nontius.proje.repository.NewsRepository;
import com.nontius.proje.repository.PatchRepository;
import com.nontius.proje.service.MapService;
import com.nontius.proje.service.NewsService;
import com.nontius.proje.service.PatchService;

@Service
public class MapServiceImpl implements MapService {
	

	private final MapRepository repository;
	
	public MapServiceImpl(MapRepository repository) {
		
		this.repository = repository;
	
}

	
	@Override
	public MapDTO getModel(Long id) {
		Map model = repository.findById(id).orElseThrow(() -> new MapNotFound("Not found"));
		
		
		return MapMapper.model_to_DTO(model);
	}


	@Override
	public List<MapDTO> getAll() {

		List<Map> models = repository.findAll();
		

		// TODO Auto-generated method stub
		return models.stream().map(
			
			(model) -> MapMapper.model_to_DTO(model)

		).collect(Collectors.toList());
	}
	
	@Override
	public MapDTO createModel(MapDTO modelDTO) {
		// TODO Auto-generated method stub
		Map model = MapMapper.DTO_to_model(modelDTO);
		model.setDate(LocalDate.now());
		
		Map saved = repository.save(model);
		
		return MapMapper.model_to_DTO(saved);
	}
	
	@Override
	public void delete(Long id) {

		Map model = repository.findById(id).orElseThrow(() -> new MapNotFound("Not found"));
		repository.delete(model);
	}
	
	
	@Override
	public MapDTO updateModel(Long id, MapDTO modelDTO) {
		Map model = repository.findById(id).orElseThrow(
				() -> new MapNotFound("Not found content by id: " + id)
				);
		
		model.setTitle(modelDTO.getTitle());
		model.setContent(modelDTO.getContent());
		model.setPicture(modelDTO.getPicture());
		
	
	
		Map saved = repository.save(model);
		
		
		
		return MapMapper.model_to_DTO(saved);
	}
}
