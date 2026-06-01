package objetos2.Solution11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaceTest {

    @Test
    void succesTest() {
        Race race = new Race();

        race.bikes = new Bike[3];
        race.bikes[0] = new Bike(12);
        race.bikes[1] = new Bike(20);
        race.bikes[2] = new Bike(9);
        Bike fastest = race.fastest();

        Assertions.assertEquals(20, fastest.speed);
    }

    @Test
    void testNull() {
        Race race = new Race();
        race.bikes = new Bike[0];

        Bike fastest = race.fastest();

        Assertions.assertNull(fastest);

    }

    @Test
    void testNoNegativ() {
        Assertions.assertThrows(NoNegativException.class, () ->
                new Bike(-20));
    }

}