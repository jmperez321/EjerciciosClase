package PrepExmExcepYPruebas;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class aArrayIndexOutOfTest {

    @Test
    void succesTest1() {
        int[] array = {10, 11, 15, 16};
        int res = aArrayIndexOutOf.resultado(array, 2);
        Assertions.assertEquals(11,res);
    }
    @Test
    void succesTest2() { //LANZA EXCEP LIMITE = POS
        int[] array = {10, 11, 15, 16};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            aArrayIndexOutOf.resultado(array, 4);
        });
    }

    @Test
    void succesTest3() { //LANZA EXCEP LIMITE < POS
        int[] array = {10, 11, 15, 16};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            aArrayIndexOutOf.resultado(array, 6);
        });
    }

    @Test
    void succesTest4() { //LANZA EXCEP POS > 0 (negativo)
        int[] array = {10, 11, 15, 16};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            aArrayIndexOutOf.resultado(array, -2);
        });
    }



}
