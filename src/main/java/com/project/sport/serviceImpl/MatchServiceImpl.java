package com.project.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sport.models.Matche;
import com.project.sport.repositories.MatchRepo;
import com.project.sport.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService {
	
	@Autowired
	private MatchRepo matchRepo;
	
	@Override
	public void createMatch(Matche match) {
		matchRepo.save(match);
	}

	@Override
	public List<Matche> getAllMatches() {
		return matchRepo.findAll();
	}

	@Override
	public Matche getMatchById(Long id) throws Exception {
		
		return matchRepo.findById(id).orElseThrow(() -> new Exception());
	}

	@Override
	public void deleteMatch(Long id) {
	matchRepo.deleteById(id);
	}

	@Override
	public Matche updateMatch(Matche match) {
		return matchRepo.save(match);
	}


}
