package GucciQuest.Players.Fighters;

import GucciQuest.Armours;
import GucciQuest.Players.Player;
import GucciQuest.Treasures;
import GucciQuest.Weapons;

import java.util.ArrayList;

public class Dwarf extends Player {

    public Dwarf(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag) {
        super(name, health, weapons, armours, bag);
    }

}
