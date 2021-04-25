package me.gandy.javabot.events;

import me.gandy.javabot.Command;
import me.gandy.javabot.Constants;
import me.gandy.javabot.MessageWrapper;
import me.gandy.javabot.commands.Ping;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageEvent extends ListenerAdapter {
	private Command[] commands = {
			new Ping()
	};
	
	@Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        Message msg = event.getMessage();
        if (msg.getContentRaw().toLowerCase().startsWith(Constants.PREFIX))
        {
        	MessageWrapper wrapper = new MessageWrapper(msg);
        	for (Command command : commands) {
        		if (wrapper.getArgs()[0].equalsIgnoreCase(command.getName())) {
        			command.call(wrapper);
        		}
        	}
        }
    }
}
