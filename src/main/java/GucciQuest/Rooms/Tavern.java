package GucciQuest.Rooms;

import GucciQuest.Creatures;
import GucciQuest.Treasures;

import java.util.ArrayList;

public class Tavern extends Room {

    private ArrayList<Treasures> treasures;

    public Tavern(String name, ArrayList<Treasures> treasures) {
        super(name);
        this.treasures = treasures;
    }

}
