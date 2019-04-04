package GucciQuest.Players;

import GucciQuest.Armours;
import GucciQuest.Treasures;
import GucciQuest.Weapons;

import java.util.ArrayList;

public abstract class Player {

    protected String name;
    protected int health;
    protected ArrayList<Weapons> weapons;
    protected ArrayList<Armours> armours;
    protected ArrayList<Treasures> bag;

    public Player(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag) {
        this.name = name;
        this.health = health;
        this.weapons = weapons;
        this.armours = armours;
        this.bag = bag;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public ArrayList<Armours> getArmours() {
        return armours;
    }

    public ArrayList<Treasures> getBag() {
        return bag;
    }

    public void changeHealth(int value) {
        this.health += value;
    }

    public void addWeapon(Weapons newWeapon) {
        weapons.add(newWeapon);
    }

    public void removeWeapon(Weapons weapon) {
        int weaponIndex = weapons.indexOf(weapon);
            weapons.remove(weaponIndex);
    }

    public int getWeaponCount(){
        return weapons.size();
    }

    public void addArmours(Armours newArmour) {
        armours.add(newArmour);
    }

    public void removeArmour(Armours armour) {
        int armourIndex = armours.indexOf(armour);
        armours.remove(armourIndex);
    }

    public int getArmourCount() {
        return armours.size();
    }

    public void addTreasures(Treasures newTreasure) {
        bag.add(newTreasure);
    }

    public void removeTreasure(Treasures treasure) {
        int treasureIndex = bag.indexOf(treasure);
        bag.remove(treasureIndex);
    }

    public int getTreasureCount() {
        return bag.size();
    }







}
