package com.game.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.game.config.AppConfig;
import com.game.football.Game;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = context.getBean("game", Game.class);
		System.out.println("Winner is: "+game.play());
		
		System.out.println("Number of beans is: "+context.getBeanDefinitionCount());
		System.out.println("Beans in the application context are: ");
		
		for(String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}
}
