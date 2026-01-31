package bucles;

import java.util.Locale;
import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NumInput = sc.nextInt();
        int Factor = 1;
        for (int A = NumInput; A > 0; A--) {
            Factor = NumInput * Factor;
            NumInput--;
        }
        System.out.println(Factor);
    }
}

