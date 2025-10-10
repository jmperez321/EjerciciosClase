package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class Rubik {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long N = sc.nextLong();
        long Tcub = N*N*N;
        long Th = (N-2)*(N-2)*(N-2);
        long Total = Tcub-Th;

        System.out.println(Total);

    }
}
