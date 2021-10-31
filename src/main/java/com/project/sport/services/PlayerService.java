package com.project.sport.services;

import java.util.List;

import com.project.sport.models.Player;

public interface PlayerService {
	public void createPlayer (Player player);
	public List<Player> getAllPlayer ();
	public Player getPlayerhById (Long id) throws Exception;
	public void deletePlayer (Long id);
	public Player updatePlayer (Player player);

}
