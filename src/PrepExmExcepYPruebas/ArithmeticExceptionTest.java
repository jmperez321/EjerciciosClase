package PrepExmExcepYPruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class ArithmeticExceptionTest {

    @Test
    void successTest() {
        int result= ArithmeticException.devolver(10);
        Assertions.assertEquals(1,result);
    }

    @Test
    void successTest2() {

        Assertions.assertThrows(java.lang.ArithmeticException.class,() -> ArithmeticException.devolver(0));
    }
    @Test
    void successTest3() {
        int result= ArithmeticException.devolver(-2);
        Assertions.assertEquals(-5,result);
    }

    @Test
    void successTest4() {
        int result= ArithmeticException.devolver(20);
        Assertions.assertEquals(0,result);
    }
    @Test
    void successTest5() {
        int result= ArithmeticException.devolver(3);
        Assertions.assertEquals(3,result);
    }
}
