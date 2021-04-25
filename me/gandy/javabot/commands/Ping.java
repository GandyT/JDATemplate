package me.gandy.javabot.commands;

import me.gandy.javabot.Command;
import me.gandy.javabot.MessageWrapper;

public class Ping extends Command {

	public Ping() {
		super();
		this.setName("ping");
		this.setDesc("The Bot will respond with pong");
	}
	
	@Override
	public void call (MessageWrapper msg) {
		msg.getChannel().sendMessage("PONG!");
	}
}
