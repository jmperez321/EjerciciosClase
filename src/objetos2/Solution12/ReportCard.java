package objetos2.Solution12;

public class ReportCard {

    public Grade[] grades;
    public float averageGrade;

    ReportCard(int numGrades) {
        grades = new Grade[numGrades];
    }

    public float calculateAverageGrade() {
        float acum = 0;
        for (int i = 0; i < grades.length; i++) {
            acum += (grades[i].grade * grades[i].weight / 100);
        }
        averageGrade = acum;
        return acum;
    }
}