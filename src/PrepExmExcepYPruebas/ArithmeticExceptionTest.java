package PrepExmExcepYPruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class ArithmeticExceptionTest {

    @Test
    void successTest() {
        int result= ArithmeticException.devolver(6);
        Assertions.assertEquals(1,result);
    }


    @Test
    void successTest2() {

        Assertions.assertThrows(java.lang.ArithmeticException.class,() -> ArithmeticException.devolver(0));
    }


}
