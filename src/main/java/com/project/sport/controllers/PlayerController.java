package com.project.sport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.sport.models.Player;
import com.project.sport.services.PlayerService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/teams")
public class PlayerController {
	@Autowired
	private PlayerService playerService;

	@GetMapping("")
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayer();
	}
	@GetMapping("/{id}")
	public Player getPlayerById (@PathVariable Long id) throws Exception {
		return playerService.getPlayerhById(id);
	}
	@DeleteMapping("/{id}")
	public void deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
	@PostMapping("")
	public void addPlayer (@RequestBody Player player) {
		playerService.createPlayer(player);
	}
	@PutMapping("/{id}")
	public Player updatePlayer (@PathVariable Long id, @RequestBody Player player) {
		return playerService.updatePlayer(player);
	}


}
