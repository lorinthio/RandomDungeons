package me.Lorinth.RandomDungeons.Utils;

import org.bukkit.ChatColor;

public class Messages {

	private static String messagePrefix = "[RandomDungeon] ";
	private static String successPrefix = ChatColor.GREEN + "";
	private static String warningPrefix = ChatColor.YELLOW + "";
	private static String errorPrefix = ChatColor.RED + "";
	
	public static String getStartMessage(){
		return successPrefix + messagePrefix + "has been enabled";
	}
	
	public static String getStopMessage(){
		return warningPrefix + messagePrefix + "has been disabled";
	}
	
	public static String generateDungeon(){
		return successPrefix + messagePrefix + "Dungeon generated";
	}
	
	public static String worldLoaded(){
		return successPrefix + messagePrefix + "Dungeon World Loaded";
	}
	
	public static String worldUnloaded(){
		return warningPrefix + messagePrefix + "Dungeon World Unloaded";
	}
	
}
