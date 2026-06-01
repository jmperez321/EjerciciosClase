package objetos2.Solution16;

import java.util.Locale;
import java.util.Scanner;


public class Solution16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Equation equation = new Equation();

        while((equation.a = scanner.nextFloat()) != 0) {
            equation.b = scanner.nextFloat();

            equation.calculateSolution();
            System.out.format("%.2f * %.2f + %.2f = 0%n", equation.a, equation.x, equation.b);
        }
    }
}
