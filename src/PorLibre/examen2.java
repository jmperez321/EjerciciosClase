package PorLibre;

import java.util.Locale;
import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean E = sc.nextBoolean();
        boolean F = sc.nextBoolean();
        boolean A = sc.nextBoolean();

        boolean B = (E && !F && !A)||(!E && !F && !A);

        System.out.println(B);
    }
}