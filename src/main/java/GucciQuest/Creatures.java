package GucciQuest;

public enum Creatures {

    MagicDragon("Puff the Dragon", 150),
    Ogre("Olga the Ogre", 50),
    Troll("Toto the Troll", 80),
    SabreToothTiger("Sarah the SabreTooth Tiger", 130),
    RabidKitten("Kevin the Kitten", 25),
    GucciGriffin("Gucci Griffin", 155),
    GrumpyBear("George the Bear", 90 );


    private final String name;
    private int value;

    Creatures(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getCreatureName() {
        return name;
    }

    public int getCreatureValue() {
        return value;
    }

}
