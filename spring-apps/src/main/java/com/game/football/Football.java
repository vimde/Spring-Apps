package com.game.football;

import javax.sql.DataSource;

public class Football implements Game {

	private Team homeTeam;
	private Team awayTeam;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Football(Team homeTeam, Team awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	@Override
	public String play() {
		return Math.random() > 0.5 ? homeTeam.getName() : awayTeam.getName();
	}

}
