package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraAmbMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int R = 0;

        if (C == 1) {
            R = suma(A, B);
        } else if (C == 2) {
            R = resta(A, B);
        } else if (C == 3) {
            R = multi(A, B);
        } else if (C == 4) {
            R = divi(A, B);
        }
        System.out.println("MENU:\n" +
                "1.-SUMAR\n" +
                "2.-RESTAR\n" +
                "3.-MULTIPLICAR\n" +
                "4.-DIVIDIR\n" +
                "Esculli una opcio:");

        System.out.println(R);
    }

    public static int suma(int A, int B) {
        return A + B;
    }

    public static int resta(int A, int B) {
        return A - B;
    }

    public static int multi(int A, int B) {
        return A * B;
    }

    public static int divi(int A, int B) {
        return A / B;
    }
}