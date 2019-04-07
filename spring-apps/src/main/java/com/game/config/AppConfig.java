package com.game.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.game.football.Chelsea;
import com.game.football.Football;
import com.game.football.Game;
import com.game.football.Liverpool;
import com.game.football.Team;

@Configuration
@Import(InfraConfig.class)
public class AppConfig {

	@Bean
	public Game game() {
		return new Football(chelsea(), liverpool());
	}

	@Bean
	public Team chelsea() {
		return new Chelsea();
	}
	
	@Bean
	public Team liverpool() {
		return new Liverpool();
	}
}
