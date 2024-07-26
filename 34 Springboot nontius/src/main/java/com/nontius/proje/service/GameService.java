package com.nontius.proje.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.DTO.CreateGame;
import com.nontius.proje.DTO.GameDTO;
import com.nontius.proje.exception.GameNotFound;
import com.nontius.proje.model.Game;
import com.nontius.proje.repository.GameRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameService {
	
	
	@Autowired
	private GameRepository repository;
	
	//Create Game
	public void createGame(CreateGame gameDTO) {
		
		
		Game game = new Game();
		
		game.setName(gameDTO.getName());
		game.setDesc(gameDTO.getDesc());
		game.setGameURL(gameDTO.getGameURL());
		game.setImgUrl(gameDTO.getImgUrl());
		
		repository.save(game);
		
		
	}
	

	
	
	
	// Get Game
	
	public GameDTO getGame(String id) {
		
		Game game = repository.findById(id).orElseThrow(
					() -> new GameNotFound("Oyun bulunamadı")
				);
		
		
		GameDTO gameDTO = new GameDTO();
		
		gameDTO.setName(game.getName());
		gameDTO.setDesc(game.getDesc());
		gameDTO.setGameURL(game.getGameURL());
		gameDTO.setImgUrl(game.getImgUrl());
		
		return gameDTO;
		
		
		
	}
	
	
	public void delete(String id) {
		
		List<Game> games = repository.findAll();
		
		for(Game game : games) {
			
			if(game.getId().equals(id)) {
				repository.delete(game);
			}
		}
	}
	
	
	// List Games
	
	public List<GameDTO> getGames(){
		
		 List<Game> games = repository.findAll();
	        return games.stream()
	                    .map(this::convertToDTO)
	                    .collect(Collectors.toList());
	}
	
    private GameDTO convertToDTO(Game game) {
        return new GameDTO(game.getId(), game.getName(), game.getDesc(), game.getImgUrl(), game.getGameURL());
    }

}
