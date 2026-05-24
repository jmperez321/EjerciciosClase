package PrepExmExcepYPruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class iImputMissMatchTest {

    @Test
    void successTest(){
        Scanner sc = new Scanner ("12");
        int mm = iImputMissMatch.leer(sc);
        Assertions.assertEquals(12,mm);
    }

    @Test
    void successTest2() {
        Scanner sc = new Scanner("melon");

        Assertions.assertThrows(InputMismatchException.class, () -> {
            iImputMissMatch.leer(sc);
        });
    }

    @Test
    void successTest3() {
        Scanner sc = new Scanner("11.2");

        Assertions.assertThrows(InputMismatchException.class, () -> {
            iImputMissMatch.leer(sc);
        });
    }

}
