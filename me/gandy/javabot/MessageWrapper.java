package me.gandy.javabot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;

public class MessageWrapper {
	private String content;
	private String[] args;
	private User author;
	private MessageChannel channel;
	private Guild guild;
	private JDA client;
	
	public MessageWrapper (Message msg) {
		this.content = msg.getContentRaw().substring(Constants.PREFIX.length());
		this.args = content.split(" ");
		this.author = msg.getAuthor();
		this.channel = msg.getChannel();
		this.guild = msg.getGuild();
		this.client = JavaBot.getInstance();
	}
	
	public String getContent () {
		return this.content;
	}
	public String[] getArgs () {
		return this.args;
	}
	public User getAuthor () {
		return this.author;
	}
	public MessageChannel getChannel () {
		return this.channel;
	}
	public Guild getGuild () {
		return this.guild;
	}
	public JDA getClient () {
		return this.client;
	}
}
