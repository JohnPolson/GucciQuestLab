package GucciQuest;

public enum Spells {

    LoveSpell("Love Spell", 100),
    AvadaKedavra("Avada Kedavra", -150),
    Expelliarmus("Expelliarmus", 120),
    ImperioCurse("Imperio Curse", -95);

    private final String name;
    private int value;

    Spells(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getSpellName() {
        return name;
    }

    public int getSpellValue() {
        return value;
    }

}
