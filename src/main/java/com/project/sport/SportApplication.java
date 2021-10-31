package com.project.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.sport.models.Matche;
import com.project.sport.repositories.MatchRepo;

@SpringBootApplication
public class SportApplication implements CommandLineRunner {
	@Autowired
	private MatchRepo matchRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		matchRepo.save(new Matche("CAB", "EST", "1", "2"));
	}

}
