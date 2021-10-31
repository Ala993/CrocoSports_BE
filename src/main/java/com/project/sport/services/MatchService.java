package com.project.sport.services;

import java.util.List;

import com.project.sport.models.Matche;

public interface MatchService {
	public void createMatch (Matche match);
	public List<Matche> getAllMatches ();
	public Matche getMatchById (Long id) throws Exception;
	public void deleteMatch (Long id);
	public Matche updateMatch (Matche match);

}
