package com.nontius.proje.serviceImpl;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.nontius.proje.entity.News;
import com.nontius.proje.entity.Patch;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.entityDTO.PatchDTO;
import com.nontius.proje.exception.AgentNotFound;
import com.nontius.proje.exception.NewsNotFound;
import com.nontius.proje.exception.PatchNotFound;
import com.nontius.proje.mapper.NewsMapper;
import com.nontius.proje.mapper.PatchMapper;
import com.nontius.proje.repository.NewsRepository;
import com.nontius.proje.repository.PatchRepository;
import com.nontius.proje.service.NewsService;
import com.nontius.proje.service.PatchService;

@Service
public class PatchServiceImpl implements PatchService {
	

	private final PatchRepository repository;
	
	public PatchServiceImpl(PatchRepository repository) {
		
		this.repository = repository;
	
}

	
	@Override
	public PatchDTO getModel(Long id) {
		Patch model = repository.findById(id).orElseThrow(() -> new PatchNotFound("Not found"));
		
		
		return PatchMapper.model_to_DTO(model);
	}


	@Override
	public List<PatchDTO> getAll() {

		List<Patch> models = repository.findAll();
		

		// TODO Auto-generated method stub
		return models.stream().map(
			
			(model) -> PatchMapper.model_to_DTO(model)

		).collect(Collectors.toList());
	}
	
	@Override
	public PatchDTO createModel(PatchDTO modelDTO) {
		// TODO Auto-generated method stub
		Patch model = PatchMapper.DTO_to_model(modelDTO);
		model.setDate(LocalDate.now());
		
		Patch saved = repository.save(model);
		
		return PatchMapper.model_to_DTO(saved);
	}
	
	@Override
	public void delete(Long id) {

		Patch model = repository.findById(id).orElseThrow(() -> new PatchNotFound("Not found"));
		repository.delete(model);
	}
	
	
	@Override
	public PatchDTO updateModel(Long id, PatchDTO modelDTO) {
		Patch model = repository.findById(id).orElseThrow(
				() -> new NewsNotFound("Not found content by id: " + id)
				);
		
		model.setTitle(modelDTO.getTitle());
		model.setContent(modelDTO.getContent());
		model.setPicture(modelDTO.getPicture());
		
	
	
		Patch saved = repository.save(model);
		
		
		
		return PatchMapper.model_to_DTO(saved);
	}
}
