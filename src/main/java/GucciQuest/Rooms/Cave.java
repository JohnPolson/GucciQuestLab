package GucciQuest.Rooms;

import GucciQuest.Creatures;
import GucciQuest.Treasures;

import java.util.ArrayList;

public class Cave extends Room {

    private ArrayList<Creatures> creatures;
    private ArrayList<Treasures> treasures;

    public Cave(String name, ArrayList<Creatures> creatures, ArrayList<Treasures> treasures) {
        super(name);
        this.creatures = creatures;
        this.treasures = treasures;
    }

    public int getCreatureCount() {
        return this.creatures.size();
    }

    public void addCreature(Creatures creature) {
        creatures.add(creature);
    }

    public void removeCreature(Creatures creature) {
        int creatureIndex = creatures.indexOf(creature);
        creatures.remove(creatureIndex);
    }
}
