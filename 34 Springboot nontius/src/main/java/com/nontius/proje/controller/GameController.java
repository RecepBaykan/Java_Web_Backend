package com.nontius.proje.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.DTO.CreateGame;
import com.nontius.proje.DTO.GameDTO;
import com.nontius.proje.service.GameService;

@RestController
@RequestMapping("game")
public class GameController {

	@Autowired
	private GameService service;

	@PostMapping("create")
	public void createGame(@RequestBody CreateGame gameDTO) {

		service.createGame(gameDTO);

	}

	@PostMapping("delete")
	public void delete(@RequestBody Map<String, String> gameID) {

		String id = gameID.get("id").toString();
	}

	@PostMapping("find")
	public GameDTO getGame(@RequestBody Map<String, String> gameID) {

		String id = gameID.get("id").toString();
		return service.getGame(id);
	}

	@GetMapping("list")
	public List<GameDTO> getGames() {

		return service.getGames();
	}
}
