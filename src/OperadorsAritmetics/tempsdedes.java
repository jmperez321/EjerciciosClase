package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class tempsdedes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int vel = sc.nextInt();
        int pes = sc.nextInt();


        int rest = (pes*1024)/vel;
        System.out.println(rest);

    }
}