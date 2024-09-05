package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.AgentDTO;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;
import com.nontius.proje.entityDTO.WeaponDTO;

@Service
public interface WeaponService {

	WeaponDTO getModel(Long id);
	
	List<WeaponDTO> getAll(); 
	
	WeaponDTO createModel(WeaponDTO modelDTO);
	
	void delete(Long id);
	
	WeaponDTO updateModel(Long id, WeaponDTO modelDTO);
	
	
}
