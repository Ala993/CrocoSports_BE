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

import com.project.sport.models.Matche;
import com.project.sport.services.MatchService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/clients")
public class MatchController {
	
	@Autowired
	private MatchService matchService;

	@GetMapping("")
	public List<Matche> getAllMatches(){
		return matchService.getAllMatches();
	}
	@GetMapping("/{id}")
	public Matche getMatcheById (@PathVariable Long id) throws Exception {
		return matchService.getMatchById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteMatche(@PathVariable Long id) {
		matchService.deleteMatch(id);
	}
	@PostMapping("")
	public void addMatch (@RequestBody Matche matche) {
		matchService.createMatch(matche);
	}
	@PutMapping("/{id}")
	public Matche updateClient (@PathVariable Long id, @RequestBody Matche match) {
		return matchService.updateMatch(match);
	}
}
