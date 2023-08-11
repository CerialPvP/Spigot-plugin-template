package online.unhack.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelloWorldCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
        if (!arg1.getName().equalsIgnoreCase("helloworld")) return true;

        arg0.sendMessage("Hello world, "+arg0.getName()+"!");
        
        return true;
    }

}