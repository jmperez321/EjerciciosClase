package objetos2.Solution12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReportCardTest {
    @Test
    void successTest(){
        ReportCard rc = new ReportCard(2);
        rc.grades[0]= new Grade("Projecte", 10,50);
        rc.grades[1]= new Grade("Examen", 0,50);

        Assertions.assertEquals(5.00f, rc.calculateAverageGrade());
    }
    @Test
    void testVoid(){
        ReportCard rc = new ReportCard(0);
        Assertions.assertEquals(0, rc.grades.length);
    }
    @Test
    void testNegativGrade(){
        Assertions.assertThrows(NoNegativException.class,()-> new Grade("Examen", -5,50));
    }
    @Test
    void testNegativWeight(){
        Assertions.assertThrows(NoNegativException.class,()-> new Grade("Examen", 5,-50));
    }

}