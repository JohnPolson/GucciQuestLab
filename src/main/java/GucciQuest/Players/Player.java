package GucciQuest.Players;

import GucciQuest.Armours;
import GucciQuest.Treasures;
import GucciQuest.Weapons;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Weapons> weapons;
    private ArrayList<Armours> armours;
    private ArrayList<Treasures> bag;

    public Player(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag) {
        this.name = name;
        this.health = health;
        this.weapons = weapons;
        this.armours = armours;
        this.bag = bag;
    }


}
