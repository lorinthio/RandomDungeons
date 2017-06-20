package me.Lorinth.RandomDungeon;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	static ConsoleCommandSender console;
	DungeonManager DM;
	
	@Override
	public void onEnable(){
		console = Bukkit.getConsoleSender();
		this.DM = new DungeonManager();
	}
	
	public void generateDungeon(){
		
	}
	
	public static ConsoleCommandSender getConsole(){
		return console;
	}
	
}
