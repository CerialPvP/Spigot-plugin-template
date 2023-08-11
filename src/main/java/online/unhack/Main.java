package online.unhack;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import online.unhack.commands.HelloWorldCommand;
import online.unhack.events.HelloWorldEvent;

/**
 * Hello world!
 *
 */
public class Main extends JavaPlugin {
    private Logger logger = null;
    private static Main instance = null;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        logger = this.getLogger();
        instance = this;
        
        // Events
        Bukkit.getPluginManager().registerEvents(new HelloWorldEvent(), this);
        // Commands
        Bukkit.getPluginCommand("helloworld").setExecutor(new HelloWorldCommand());
        logger.info("Plugin enabled. Hello world!");
    }

    @Override
    public void onDisable() {
        logger.info("Shutting down...");
        logger = null;
        instance = null;
    }
}
