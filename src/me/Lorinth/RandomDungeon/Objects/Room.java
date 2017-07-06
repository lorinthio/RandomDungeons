package me.Lorinth.RandomDungeon.Objects;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

public class Room {

	private Vector3 min;
	private Vector3 max;
	private Vector3 size;
	private ArrayList<LivingEntity> entities;
	
	public ArrayList<LivingEntity> getEntities(){
		return entities;
	}


	public Room(Vector3 min, Vector3 size){
	    this.min = min;
	    this.size = size;
	    this.max = min.add(size);
    }

	public boolean contains(Room room){
        return room.getMin().isBetween(min, max) || room.getMax().isBetween(min, max);
    }

    public Vector3 getCenter(){
	    return new Vector3(
            this.min.getX() + this.size.getX() / 2 + 1,
            this.min.getY() + this.size.getY() / 2 + 1,
            this.min.getZ() + this.size.getZ() / 2 + 1
        );
    }

    public Vector3 getMin(){
	    return this.min;
    }

    public Vector3 getMax(){
        return this.max;
    }

    public Vector3 getSize(){
	    return this.size;
    }
}
