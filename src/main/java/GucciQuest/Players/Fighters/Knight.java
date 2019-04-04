package GucciQuest.Players.Fighters;

import GucciQuest.Armours;
import GucciQuest.Players.Player;
import GucciQuest.Treasures;
import GucciQuest.Weapons;

import java.util.ArrayList;

public class Knight extends Player {

    public Knight(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag) {
        super(name, health, weapons, armours, bag);
    }

}
