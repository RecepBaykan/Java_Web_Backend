package com.nontius.proje.serviceImpl;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Map;
import com.nontius.proje.entity.News;
import com.nontius.proje.entity.Patch;
import com.nontius.proje.entity.Weapon;
import com.nontius.proje.entityDTO.MapDTO;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;
import com.nontius.proje.entityDTO.WeaponDTO;
import com.nontius.proje.exception.AgentNotFound;
import com.nontius.proje.exception.MapNotFound;
import com.nontius.proje.exception.NewsNotFound;
import com.nontius.proje.exception.PatchNotFound;
import com.nontius.proje.exception.WeaponNotFound;
import com.nontius.proje.mapper.MapMapper;
import com.nontius.proje.mapper.NewsMapper;
import com.nontius.proje.mapper.PatchMapper;
import com.nontius.proje.mapper.WeaponMapper;
import com.nontius.proje.repository.MapRepository;
import com.nontius.proje.repository.NewsRepository;
import com.nontius.proje.repository.PatchRepository;
import com.nontius.proje.repository.WeaponRepository;
import com.nontius.proje.service.MapService;
import com.nontius.proje.service.NewsService;
import com.nontius.proje.service.PatchService;
import com.nontius.proje.service.WeaponService;

@Service
public class WeaponServiceImpl implements WeaponService {
	

	private final WeaponRepository repository;
	
	public WeaponServiceImpl(WeaponRepository repository) {
		
		this.repository = repository;
	
}

	
	@Override
	public WeaponDTO getModel(Long id) {
		Weapon model = repository.findById(id).orElseThrow(() -> new WeaponNotFound("Not found"));
		
		
		return WeaponMapper.model_to_DTO(model);
	}


	@Override
	public List<WeaponDTO> getAll() {

		List<Weapon> models = repository.findAll();
		

		// TODO Auto-generated method stub
		return models.stream().map(
			
			(model) -> WeaponMapper.model_to_DTO(model)

		).collect(Collectors.toList());
	}
	
	@Override
	public WeaponDTO createModel(WeaponDTO modelDTO) {
		// TODO Auto-generated method stub
		Weapon model = WeaponMapper.DTO_to_model(modelDTO);
		
		
		Weapon saved = repository.save(model);
		
		return WeaponMapper.model_to_DTO(saved);
	}
	
	@Override
	public void delete(Long id) {

		Weapon model = repository.findById(id).orElseThrow(() -> new WeaponNotFound("Not found"));
		repository.delete(model);
	}
	
	
	@Override
	public WeaponDTO updateModel(Long id, WeaponDTO modelDTO) {
		Weapon model = repository.findById(id).orElseThrow(
				() -> new WeaponNotFound("Not found content by id: " + id)
				);
		
		model.setTitle(modelDTO.getTitle());
		model.setContent(modelDTO.getContent());
		model.setPicture(modelDTO.getPicture());
		
	
	
		Weapon saved = repository.save(model);
		
		
		
		return WeaponMapper.model_to_DTO(saved);
	}
}
