package me.Lorinth.RandomDungeon;

import me.Lorinth.RandomDungeon.Objects.Dungeon;
import me.Lorinth.RandomDungeon.Objects.DungeonStyle;
import me.Lorinth.RandomDungeon.Objects.Room;

/**
 * Created by BenRandall on 6/20/2017.
 */
public class RoomMaker {

    public static void createRoom(Room room, Dungeon dungeon){
        DungeonStyle style = dungeon.getStyle();
        makeFloor(room, style);
        makeWalls(room, style);
        makeCeiling(room, style);
    }

    private static void makeFloor(Room room, DungeonStyle style){

    }

    private static void makeWalls(Room room, DungeonStyle style){

    }

    private static void makeCeiling(Room room, DungeonStyle style){

    }

    public static void createHallway(Room a, Room b, DungeonStyle style){

    }

}
