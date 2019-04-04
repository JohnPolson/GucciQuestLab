package GucciQuest;

public enum Armours {

    SuitOfArmour("Suit of Armour", 100),
    Chainmail("Chainmail", 80),
    StabVest("Stab Vest", 30),
    Mithril("Mithril Vest", 35),
    Helmet("Helmet", 10),
    Cloak("Cloak of Invincibility", 50),
    GucciHat("Gucci Baseball cap", 110);


    private final String name;
    private int value;

    Armours(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getArmourName() {
        return name;
    }

    public int getArmourValue() {
        return value;
    }


}
