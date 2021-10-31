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

import com.project.sport.models.Team;
import com.project.sport.services.TeamService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/teams")
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	@GetMapping("")
	public List<Team> getAllTeams(){
		return teamService.getAllTeams();
	}
	@GetMapping("/{id}")
	public Team getTeamById (@PathVariable Long id) throws Exception {
		return teamService.getTeamhById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteTeam(@PathVariable Long id) {
		teamService.deleteTeam(id);
	}
	@PostMapping("")
	public void addTeam (@RequestBody Team team) {
		teamService.createTeam(team);
	}
	@PutMapping("/{id}")
	public Team updateTeam (@PathVariable Long id, @RequestBody Team team) {
		return teamService.updateTeam(team);
	}
	
}
