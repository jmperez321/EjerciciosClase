package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class RepeatX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NumeroUser = sc.nextInt();

        for (int A =1; A<=NumeroUser; A++){
            System.out.print(NumeroUser);
        }
    }
}
