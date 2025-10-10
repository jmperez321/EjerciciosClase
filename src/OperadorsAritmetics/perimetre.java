package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class perimetre {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        int x = x1-y1;
        int y = x2-y2;

        int P = 2*x+2*y;

        System.out.println(P);
    }
}
