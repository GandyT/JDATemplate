package me.gandy.javabot.events;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyOnEvent extends ListenerAdapter {
	@Override
	public void onReady (ReadyEvent event) {
			System.out.println("JavaBot is ready!");
	}
}
