package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.nontius.proje.entityDTO.MapDTO;


@Service
public interface MapService {

	MapDTO getModel(Long id);
	
	List<MapDTO> getAll(); 
	
	MapDTO createModel(MapDTO modelDTO);
	
	void delete(Long id);
	
	MapDTO updateModel(Long id, MapDTO modelDTO);
	
	
}
