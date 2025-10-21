package ConversTipusCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class treurebrossa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1 = sc.nextLine();
        String P2 = sc.nextLine();

        String P1a = P1.substring(1);
        int P2L = P2.length()-2;
        String P2a = P2.substring(0,P2L);

        System.out.println();
    }
}
