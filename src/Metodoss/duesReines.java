package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class duesReines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean aggro = aggroCheck(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(aggro);
    }

    public static boolean aggroCheck(int X1, int Y1, int X2, int Y2) {
        return X2 == X1 || Y2 == Y1 || X1 + Y1 == X2 + Y2 || X1 - Y1 == X2 - Y2;
    }
}