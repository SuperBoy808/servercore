package we.SuperBoy808Vertmix.core;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	Logger Logger = Bukkit.getLogger();
	
	public void onEnable() {
		Logger.info(ChatColor.GREEN + "Server Core has been enabled.");
	}
	
	public void onDisable() {
		Logger.severe(ChatColor.RED + "Server Core has been disabled.");
	}

}
