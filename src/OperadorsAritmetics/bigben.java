package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class bigben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int Z = sc.nextInt();

        int suma = H+Z;
        int hora = suma % 12;

        System.out.println(hora);
    }
}
