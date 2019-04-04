import GucciQuest.Armours;
import GucciQuest.Players.Fighters.Barbarian;
import GucciQuest.Treasures;
import GucciQuest.Weapons;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    ArrayList<Weapons> weapons;
    ArrayList<Armours> armours;
    ArrayList<Treasures> bag;

    @Before
    public void before() {

        weapons = new ArrayList<Weapons>();
        armours = new ArrayList<Armours>();
        bag = new ArrayList<Treasures>();
        barbarian = new Barbarian("Jon", 99, weapons, armours, bag);
    }

    @Test
    public void hasName(){
        assertEquals("Jon", barbarian.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(99,barbarian.getHealth());
    }

    @Test
    public void hasNoWeapons() {
        assertEquals(0, barbarian.getWeaponCount());
    }

    @Test
    public void canAddWeapon() {
        barbarian.addWeapon(Weapons.Axe);
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void canRemoveWeapon() {
        barbarian.addWeapon(Weapons.GucciSpear);
        barbarian.addWeapon(Weapons.Chainsaw);
        barbarian.removeWeapon(Weapons.Chainsaw);
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void hasNoArmours() {
        assertEquals(0, barbarian.getArmourCount() );
    }

    @Test
    public void canAddArmour() {
        barbarian.addArmours(Armours.Chainmail);
        assertEquals(1, barbarian.getArmourCount());
    }

    @Test
    public void canRemoveArmour() {
        barbarian.addArmours(Armours.SuitOfArmour);
        barbarian.addArmours(Armours.GucciHat);
        barbarian.removeArmour(Armours.SuitOfArmour);
        assertEquals(1, barbarian.getArmourCount());
    }

    @Test
    public void hasEmptyBag() {
        assertEquals(0, barbarian.getTreasureCount());
    }

    @Test
    public void canAddToBag() {
        barbarian.addTreasures(Treasures.Diamond);
        barbarian.addTreasures(Treasures.GucciTiara);
        assertEquals(2, barbarian.getTreasureCount());
    }

    @Test
    public void canRemoveFromBag() {
        barbarian.addTreasures(Treasures.Diamond);
        barbarian.addTreasures(Treasures.GucciTiara);
        barbarian.removeTreasure(Treasures.Diamond);
        assertEquals(1, barbarian.getTreasureCount());
    }




}
