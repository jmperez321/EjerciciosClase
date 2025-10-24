package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int Ow = N/24;
        int Os = N%24;
        int F = 24-Os;

        if (Os > 0) {
            Ow + 1;
        }
        else{
            Ow+0;
        }


        System.out.println(Ow + "  " + F);

    }
}
