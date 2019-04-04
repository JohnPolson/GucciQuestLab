package GucciQuest;

public enum Armours {

    SuitOfArmour("Suit of Armour", 100),
    Chainmail("Chainmail", 80),
    StabVest("Stab Vest", 30),
    Mithril("Mithril Vest", 35),
    Helmet("Helmet", 10),
    Cloak("Cloak of Invincibility", 50),
    Hat("Baseball cap", 5);


    private final String name, int value;

    Armours(String name, int value) {
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
