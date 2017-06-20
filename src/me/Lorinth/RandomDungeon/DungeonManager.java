package me.Lorinth.RandomDungeon;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;

import me.Lorinth.RandomDungeons.Utils.Messages;

public class DungeonManager {

	private String name = "dungeons";
	
	public DungeonManager(){
		loadWorld();
	}
	
	public World loadWorld() {
	    World world = Bukkit.getWorld(this.name);

	    if (world != null) {
	        Bukkit.unloadWorld(world, false);
	        Main.console.sendMessage(Messages.worldUnloaded());
	        world = null;
	    }

	    WorldCreator creator = new WorldCreator(this.name);
	    creator.environment(Environment.NORMAL);
	    creator.generateStructures(false);
	    world = creator.createWorld();
	    world.setDifficulty(Difficulty.NORMAL);
	    world.setSpawnFlags(false, false);
	    world.setPVP(false);
	    world.setStorm(false);
	    world.setThundering(false);
	    world.setKeepSpawnInMemory(false);
	    world.setTicksPerAnimalSpawns(0);
	    world.setTicksPerMonsterSpawns(0);
	    world.setWeatherDuration(0);
	    
        Main.console.sendMessage(Messages.worldLoaded());

	    world.setAutoSave(false);
	    return world;
	}
	
}
