package objetos2.Solution12;

import java.util.*;

public class Solution12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            ReportCard reportCard = new ReportCard(n);

            for (int i = 0; i < n; i++) {
                String assignment = sc.next();
                float grade = sc.nextFloat();
                float weight = sc.nextFloat();

                reportCard.grades[i] = new Grade(assignment, grade, weight);
            }

            float a = reportCard.calculateAverageGrade();

            System.out.format("Average Grade: %.2f%n", reportCard.averageGrade);
        }catch (NoNegativException e){
            System.out.println(e.getMessage());
        }
    }
}