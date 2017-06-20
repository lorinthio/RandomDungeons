package me.Lorinth.RandomDungeon.Objects;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

public class Room {

	private Location center;
	private ArrayList<LivingEntity> entities;
	
	public ArrayList<LivingEntity> getEntities(){
		return entities;
	}
	
}
