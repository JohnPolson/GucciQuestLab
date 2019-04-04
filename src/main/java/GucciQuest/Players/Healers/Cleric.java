package GucciQuest.Players.Healers;

import GucciQuest.Armours;
import GucciQuest.Healthboosters;
import GucciQuest.Players.Player;
import GucciQuest.Treasures;
import GucciQuest.Weapons;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<Healthboosters> healthboosters;

    public Cleric(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag, ArrayList<Healthboosters> healthboosters) {
        super(name, health, weapons, armours, bag);
        this.healthboosters = healthboosters;

    }

}
