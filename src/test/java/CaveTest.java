import GucciQuest.Creatures;
import GucciQuest.Rooms.Cave;
import GucciQuest.Treasures;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CaveTest {

    Cave cave;
    ArrayList<Creatures> creatures;
    ArrayList<Treasures> treasures;

    @Before
    public void before() {
        creatures  = new ArrayList<Creatures>();
        treasures  = new ArrayList<Treasures>();
        cave = new Cave("CreepyCave", creatures, treasures);
    }

    @Test
    public void hasName() {
        assertEquals("CreepyCave", cave.getName());
    }

    @Test
    public void hasNoCreatures() {
        assertEquals(0, cave.getCreatureCount());
    }

    @Test
    public void addCreature() {
        cave.addCreature(Creatures.GrumpyBear);
        assertEquals(1, cave.getCreatureCount());
    }

    @Test
    public void removeCreature() {
        cave.addCreature(Creatures.GucciGriffin);
        cave.addCreature(Creatures.GrumpyBear);
        cave.removeCreature(Creatures.GucciGriffin);
        assertEquals(1, cave.getCreatureCount());
    }
}
