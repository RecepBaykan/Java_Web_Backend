package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.AgentDTO;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;

@Service
public interface PatchService {

	PatchDTO getModel(Long id);
	
	List<PatchDTO> getAll(); 
	
	PatchDTO createModel(PatchDTO modelDTO);
	
	void delete(Long id);
	
	PatchDTO updateModel(Long id, PatchDTO modelDTO);
	
	
}
