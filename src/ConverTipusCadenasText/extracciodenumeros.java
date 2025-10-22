package ConverTipusCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1 = sc.nextLine();
        String A = P1.substring(1,2);
        String B = P1.substring(3,4);
        String C = P1.substring(5,6);
        String D = P1.substring(7,8);

        int A1 = Integer.parseInt(A);
        int B1 = Integer.parseInt(B);
        int C1 = Integer.parseInt(C);
        int D1 = Integer.parseInt(D);


        System.out.println(A1+B1+C1+D1);
    }
}
