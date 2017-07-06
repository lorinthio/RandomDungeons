package me.Lorinth.RandomDungeon;

import me.Lorinth.RandomDungeon.Objects.Dungeon;
import me.Lorinth.RandomDungeon.Objects.DungeonStyle;
import me.Lorinth.RandomDungeon.Objects.MaterialPattern;
import me.Lorinth.RandomDungeon.Objects.Room;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.Material;

import me.Lorinth.RandomDungeons.Utils.Messages;

import java.util.ArrayList;
import java.util.Random;

public class DungeonManager {

	private String name = "dungeons";
	private ArrayList<DungeonStyle> styleList = new ArrayList<DungeonStyle>();
	private static Random random = new Random();

	public DungeonManager(){
		loadWorld();
		loadStyles();
	}

	private void loadStyles(){
		DungeonStyle style = new DungeonStyle();
		style.setMainFloorMaterial(Material.STONE);
		style.setFloorBorder(Material.STONE_BRICK);
		style.setMainWallMaterial(Material.STONE);
		style.setMainCeilingMaterial(Material.STONE);
		style.setFloorPattern(new ArrayList<MaterialPattern>(){{ add(MaterialPattern.Bordered); }});
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

	private DungeonStyle getRandomStyle(){
	    return styleList.get(random.nextInt(styleList.size()));
    }

	public void generateDungeon(){
		Dungeon dungeon = new Dungeon();
		dungeon.setStyle(this.getRandomStyle());

		int tries = 0;
		while(tries < 5){
		    Room room = new Room();
        }
	}

	private
	
}
