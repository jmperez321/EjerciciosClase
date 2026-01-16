package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraAcumul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float subtotal = 0;
        boolean fin = false;
        boolean endBug = false;
        do {
            String OP = sc.next();
            if (OP.equals("END")) {
                fin = true;
            } else {
                float num = sc.nextFloat();
                subtotal = operacio(OP, subtotal, num);
                endBug = true;
                System.out.print("\n" + subtotal);
            }
        } while (!fin);
        if (!endBug) {
            System.out.println(subtotal);
        }
    }

    public static float operacio(String OP, float subtotal, float num) {
        if (OP.equals("+")) return suma(subtotal, num);
        if (OP.equals("-")) return resta(subtotal, num);
        if (OP.equals("/")) return divid(subtotal, num);
        if (OP.equals("*")) return multi(subtotal, num);
        return subtotal;
    }

    public static float suma(float subtotal, float num) {
        return subtotal + num;
    }

    public static float resta(float subtotal, float num) {
        return subtotal - num;
    }

    public static float multi(float subtotal, float num) {
        return subtotal * num;
    }

    public static float divid(float subtotal, float num) {
        return subtotal / num;
    }
}

