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

}
