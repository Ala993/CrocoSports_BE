package com.project.sport.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String teamOne;
	private String teamTwo;
	private String scoreOne;
	private String scoreTwo;
	
	public Long getId() {
		return id;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(String scoreOne) {
		this.scoreOne = scoreOne;
	}
	public String getScoreTwo() {
		return scoreTwo;
	}
	public void setScoreTwo(String scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	public Matche(String teamOne, String teamTwo, String scoreOne, String scoreTwo) {
		super();
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
	}
	public Matche() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", scoreOne=" + scoreOne
				+ ", scoreTwo=" + scoreTwo + "]";
	}
	
}
