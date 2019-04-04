package GucciQuest.Rooms;

import GucciQuest.Creatures;
import GucciQuest.Treasures;

import java.util.ArrayList;

public class Dungeon extends Room {

    private ArrayList<Creatures> creatures;

    public Dungeon(String name, ArrayList<Creatures> creatures) {
        super(name);
        this.creatures = creatures;
    }

}
