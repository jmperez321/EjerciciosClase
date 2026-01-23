package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class Galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Htruck = sc.nextFloat();
        int NPonts = sc.nextInt();

        for (int A = 0; A < NPonts; A++) {
            float HPonts = sc.nextFloat();
            if (Htruck > HPonts) {
                System.out.println("xoca amb el pont " + (A + 1));
                break;
            }
        }

    }
}

