package GucciQuest;

public enum Treasures {

    Diamond("Diamond", 100),
    Ruby("Ruby", 90),
    GucciTiara("Gucci Tiara", 200),
    GoldBar("Gold Bar", 80),
    GoldCoin("Gold Coin", 10),
    SilverCoin("Silver Coin", 5);


    private final String name;
    private int value;

    Treasures(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getTreasureName() {
        return name;
    }

    public int getTreasureValue() {
        return value;
    }

}
