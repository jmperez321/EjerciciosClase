package OperadorsLogics;

import java.util.Locale;
import java.util.Scanner;

public class DuesReines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        Boolean PER = X2 == X1 || Y2 == Y1 || X1 + Y1 == X2 + Y2 || X1 - Y1 == X2 - Y2;
        System.out.println(PER);
    }
}