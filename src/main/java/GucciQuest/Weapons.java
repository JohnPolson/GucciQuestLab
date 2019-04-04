package GucciQuest;

public enum Weapons {

    Sword("Sword", 20),
    Axe("Axe", 30),
    Hammer("Hammer",10),
    Shovel("Shovel",10),
    Knife("Knife",8),
    Club("Club",15),
    Spear("Spear",20),
    Flamethrower("Flamethrower",40),
    RabidHamster("RabidHamster",3),
    Bow("Bow & Arrows",15),
    Chainsaw("Chainsaw",45),
    Sythe("Sythe",35);


    private final String name, int value;

    Weapons(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }




}
