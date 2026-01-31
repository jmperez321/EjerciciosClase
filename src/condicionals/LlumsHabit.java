package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class LlumsHabit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean A = sc.nextBoolean();
        boolean B = sc.nextBoolean();
        boolean C = sc.nextBoolean();

        int A1 = A ? 1 : 0;
        int B1 = B ? 1 : 0;
        int C1 = C ? 1 : 0;

        int ABC1 = (A1 + B1 + C1);

        if (ABC1 == 0) {
            System.out.println("No s'ha encès cap llum.");
        } else if (ABC1 == 1) {
            System.out.println("Només hi ha un llum encès.");
        } else if (ABC1 == 2) {
            System.out.println("S'han encès dues llums.");
        } else {
            System.out.println("S'han encès totes les llums.");
        }
    }
}
