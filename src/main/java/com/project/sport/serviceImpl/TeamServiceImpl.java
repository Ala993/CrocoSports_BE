package com.project.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.sport.models.Team;
import com.project.sport.repositories.TeamRepo;
import com.project.sport.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepo teamRepo;
	
	@Override
	public void createTeam(Team team) {
		teamRepo.save(team);
	}

	@Override
	public List<Team> getAllTeams() {
		
		return teamRepo.findAll();
	}

	@Override
	public Team getTeamhById(Long id) throws Exception {

		return teamRepo.findById(id).orElseThrow(()-> new Exception());
	}

	@Override
	public void deleteTeam(Long id) {
		teamRepo.deleteById(id);
	}

	@Override
	public Team updateTeam(Team team) {
		
		return teamRepo.save(team);
	}

}
