package objetos2.exmRecupP9_P10_P11_P12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void successTest() {
        Calculadora c = new Calculadora();
        c.afegir(new Operand('+', 2));
        c.afegir(new Operand('*', 5));
        c.afegir(new Operand('-', 4));
        c.afegir(new Operand('/', 2));

        Assertions.assertEquals(3, c.calcular());
    }

    @Test
    void testInvalidChar() {

        Assertions.assertThrows(InvalidOperandTypeException.class, () ->
                new Operand('=', 3));
    }
    @Test
    void testDiv0() {
        Calculadora c = new Calculadora();
        c.afegir(new Operand('/', 0));


        Assertions.assertThrows(DividedByZeroException.class, () ->
                c.calcular());
    }

}
