package me.gandy.javabot;

import javax.security.auth.login.LoginException;

import me.gandy.javabot.events.MessageEvent;
import me.gandy.javabot.events.ReadyOnEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class JavaBot {
	
	private static JDA client;
	
	public static void main(String args[]) throws LoginException {
		JDA client = JDABuilder.createLight(
				Constants.TOKEN,
				GatewayIntent.GUILD_MESSAGES, 
				GatewayIntent.DIRECT_MESSAGES
			)
				.addEventListeners(
						new MessageEvent(), 
						new ReadyOnEvent()
					)
				.setActivity(Activity.watching("Coded in Java"))
				.build();
		JavaBot.client = client;
	}
	
	public static JDA getInstance() {
		return JavaBot.client;
	}
}
