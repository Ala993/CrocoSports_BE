package com.project.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sport.models.Player;
import com.project.sport.repositories.PlayerRepo;
import com.project.sport.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepo playerRepo;
	
	@Override
	public void createPlayer(Player player) {
		playerRepo.save(player);
	}

	@Override
	public List<Player> getAllPlayer() {
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayerhById(Long id) throws Exception {
		return playerRepo.findById(id).orElseThrow(Exception::new);
	}

	@Override
	public void deletePlayer(Long id) {
		playerRepo.deleteById(id);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

}
