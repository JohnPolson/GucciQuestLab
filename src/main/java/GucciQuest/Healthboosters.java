package GucciQuest;

public enum Healthboosters {

    MagicMushrooms("Magic Mushrooms", 150),
    GingerShot("Ginger Shot", 60),
    GucciGreenTea("Gucci Green Tea", 155),
    CrystalWater("Crystal Water", 80),
    MysticMana("Mystic Mana", 50);



    private final String name;
    private int value;

    Healthboosters(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getBoosterName() {
        return name;
    }

    public int getBoosterValue() {
        return value;
    }

}
