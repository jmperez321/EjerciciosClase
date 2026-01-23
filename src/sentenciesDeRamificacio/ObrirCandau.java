package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class ObrirCandau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ClauOb = sc.nextInt();
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();
        int Sub = 0;

        while (Num3 != -1) {
            Sub = (Num1 + Num2) * Num3;
            Num1 = Num2;
            Num2 = Num3;
            Num3 = sc.nextInt();
            if (Sub == ClauOb) {
                System.out.println("true");
                break;
            }
        }
        if (Sub != ClauOb) {
            System.out.println("false");
        }
    }
}

