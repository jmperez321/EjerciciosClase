package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NInicial = sc.nextInt();
        int NFinal = sc.nextInt();

        for (int A = NInicial;A<NFinal;A++){
            System.out.print(A);
        }
    }
}
