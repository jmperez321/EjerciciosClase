package objetos2.Solution08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Solution8Test {
    @Test
    void testOledInicialState(){
        OLed led = new OLed();
        Assertions.assertFalse(led.state, "el LED debería iniciar apagado (false)");
    }

    @Test
    void testOledSwitch(){
        OLed led = new OLed();

        led.switchOn();
        Assertions.assertTrue(led.state);

        led.switchOff();
        Assertions.assertFalse(led.state);
    }

    @Test
    void testLedArrayInitial(){
        LedArray array = new LedArray(5);
        assertEquals(5, array.leds.length);

    }

    @Test
    void testLedArraySwitchLed(){
        LedArray array = new LedArray(5);

        array.switchLed(2);
        Assertions.assertTrue(array.leds[2].state);

    }
    @Test
    void testException(){
        LedArray array = new LedArray(5);
        assertThrows(NoNegativException.class,()-> array.switchLed(-2));
    }


}
