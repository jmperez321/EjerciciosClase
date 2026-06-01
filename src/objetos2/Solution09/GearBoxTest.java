package objetos2.Solution09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GearBoxTest {
    @Test
    void testSucces() {
        GearBox gb = new GearBox();
        Assertions.assertEquals(0, gb.gear);
    }

    @Test
    void testGearUp() {
        GearBox gb = new GearBox();
        gb.numGears = 5;
        gb.gearUp();
        Assertions.assertEquals(1, gb.gear);
        gb.gearUp();
        Assertions.assertEquals(2, gb.gear);
    }

    @Test
    void testGearUpMAX() {
        GearBox gb = new GearBox();
        gb.numGears = 2;
        gb.gearUp();
        gb.gearUp();
        gb.gearUp();

        Assertions.assertEquals(2, gb.gear);
    }

    @Test
    void testGearDown() {
        GearBox gb = new GearBox();
        gb.numGears = 5;
        gb.gearDown();
        Assertions.assertEquals(-1, gb.gear);
    }

    @Test
    void testGearDownMAX() {
        GearBox gb = new GearBox();

        gb.gearDown();
        gb.gearDown();
        Assertions.assertEquals(-1, gb.gear);
    }


}
