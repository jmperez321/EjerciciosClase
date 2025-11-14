package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class Div3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NInicial = sc.nextInt();
        int NFinal = sc.nextInt();

        for (int A = NInicial;A<=NFinal;A++){
            if (A%3==0){
                System.out.println(A);
            }
        }
    }
}

