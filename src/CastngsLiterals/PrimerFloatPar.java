package CastngsLiterals;

import java.util.Locale;
import java.util.Scanner;

public class PrimerFloatPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float A = sc.nextFloat();
        A*=10;

        int numInt = (int)A;
        System.out.println(numInt % 10 ==0);
    }
}
