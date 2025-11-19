package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraAcumul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Subtotal=0;
        String OP = sc.next();
        if (OP.equals("END")){
            System.out.println(Subtotal);
        } else {
            while (!OP.equals("END")) {
                if (OP.equals("+")) {
                    float Num = sc.nextFloat();
                    Subtotal += Num;
                }
                if (OP.equals("-")) {
                    float Num = sc.nextFloat();
                    Subtotal -= Num;
                }
                if (OP.equals("*")) {
                    float Num = sc.nextFloat();
                    Subtotal *= Num;
                }
                if (OP.equals("/")) {
                    float Num = sc.nextFloat();
                    Subtotal /= Num;
                }
                System.out.println(Subtotal);
                OP = sc.next();
            }
        }
    }
}

