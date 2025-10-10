package OperadorsLogics;

import java.util.Locale;
import java.util.Scanner;

public class spaceinvade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int W1 = sc.nextInt();
        int H1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        int W2 = sc.nextInt();
        int H2 = sc.nextInt();

        boolean pum1 = (X1 + W1 <= X2);
        boolean pum2 = (X2 + W2 <= X1);
        boolean pum3 = (Y1 + H1 <= Y2);
        boolean pum4 = (Y2 + H2 <= Y1);
        boolean pum = (pum1 || pum2 || pum3 || pum4);
        System.out.println(!pum);
    }
}