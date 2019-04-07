package com.game.demo;

import com.game.football.Chelsea;
import com.game.football.Football;
import com.game.football.Game;
import com.game.football.Liverpool;
import com.game.football.Team;

public class JavaDemo {

	public static void main(String[] args) {
		Team liverpool = new Liverpool();
		Team chelsea = new Chelsea();
		Game game = new Football(liverpool, chelsea);
		System.out.println(game.play());
	}
}
