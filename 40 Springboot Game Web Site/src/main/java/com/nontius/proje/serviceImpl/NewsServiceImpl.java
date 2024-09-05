package com.nontius.proje.serviceImpl;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.nontius.proje.entity.News;
import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.exception.AgentNotFound;
import com.nontius.proje.exception.NewsNotFound;
import com.nontius.proje.mapper.NewsMapper;
import com.nontius.proje.repository.NewsRepository;
import com.nontius.proje.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	private final NewsRepository repository;
	
	@Override
	public NewsDTO getNews(Long id) {
		News news = repository.findById(id).orElseThrow(() -> new NewsNotFound("Not found"));
		
		
		
		return NewsMapper.model_to_DTO(news);
	}

	public NewsServiceImpl(NewsRepository repository) {
		
			this.repository = repository;
		
	}

	@Override
	public List<NewsDTO> getAll() {

		List<News> news = repository.findAll();
		

		// TODO Auto-generated method stub
		return news.stream().map(
			
			(n) -> NewsMapper.model_to_DTO(n)

		).collect(Collectors.toList());
	}
	
	@Override
	public NewsDTO createNews(NewsDTO newsDTO) {
		// TODO Auto-generated method stub
		News news = NewsMapper.DTO_to_model(newsDTO);
		news.setDate(LocalDate.now());
		
		News saved = repository.save(news);
		
		return NewsMapper.model_to_DTO(saved);
	}
	
	@Override
	public void delete(Long id) {

		News news = repository.findById(id).orElseThrow(() -> new NewsNotFound("Not found"));
		repository.delete(news);
	}
	
	
	@Override
	public NewsDTO updateNews(Long id, NewsDTO newsDTO) {
		News news = repository.findById(id).orElseThrow(
				() -> new NewsNotFound("Not found content by id: " + id)
				);
		
		news.setTitle(newsDTO.getTitle());
		news.setContent(newsDTO.getContent());
		news.setPicture(newsDTO.getPicture());
		
	
	
		News saved = repository.save(news);
		
		
		
		return NewsMapper.model_to_DTO(saved);
	}
}
