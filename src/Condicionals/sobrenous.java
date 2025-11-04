package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int Ow;
        if (N%24==0) {
            Ow =N/24;
        } else {
            Ow = (N/24)+1;
        }
        int F;
        if (N%24 == 0){
            F=0;
        } else {
            F=24-(N%24);
        }

        System.out.println(Ow + "  " + F);

    }
}