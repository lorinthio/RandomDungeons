package me.Lorinth.RandomDungeon.Objects;

import java.util.ArrayList;

import org.bukkit.Location;

public class Dungeon {

	public ArrayList<Room> rooms = new ArrayList<Room>();
	public DungeonStyle style;
	public String ownerUUID;
	public Vector3 Start;
	public Vector3 Exit;

	public Dungeon(){

    }

	public boolean addRoom(Room room){
		for(Room r : rooms){
			if(r.contains(room)){
				return false;
			}
		}

		rooms.add(room);
		return true;
	}

	public DungeonStyle getStyle(){
		return style;
	}
	
	public void setStyle(DungeonStyle style){
		this.style = style;
	}
	
	public Vector3 getStart(){
		return Start;
	}
	
	public void setStart(Vector3 start){
		this.Start = start;
	}
	
	public Vector3 getExit(){
		return Exit;
	}
	
	public void setExit(Vector3 loc){
		Exit = loc;
	}
	
	public String getOwnerUUID() {
		return ownerUUID;
	}

	public void setOwnerUUID(String ownerUUID) {
		this.ownerUUID = ownerUUID;
	}

}
