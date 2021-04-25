package me.gandy.javabot;

import net.dv8tion.jda.api.entities.Message;

public class Command {
	private String name = "Command";
	private String description = "Command Class";
	
	public Command () {
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getDesc () {
		return this.description;
	}
	
	protected void setName (String name) {
		this.name = name;
	}
	protected void setDesc (String desc) {
		this.description = desc;
	}
	
	public void call (MessageWrapper msg) {
		System.out.println("Error: @Override call method for " + this.name);
	}
}
