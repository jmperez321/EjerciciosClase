package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class arecompte {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int total = (A * C) + (B * C);
    System.out.println(total);
    }
}
