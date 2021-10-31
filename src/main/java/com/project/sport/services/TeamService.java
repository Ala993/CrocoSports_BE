package com.project.sport.services;

import java.util.List;
import com.project.sport.models.Team;

public interface TeamService {
	public void createTeam (Team team);
	public List<Team> getAllTeams ();
	public Team getTeamhById (Long id) throws Exception;
	public void deleteTeam (Long id);
	public Team updateTeam (Team team);

}
