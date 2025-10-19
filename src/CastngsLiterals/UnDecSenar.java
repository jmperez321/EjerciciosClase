package CastngsLiterals;

import java.util.Locale;
import java.util.Scanner;

public class UnDecSenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        int A1 = (int)A;
        int B1 = (int)B;
        int C1 = (int)C;

        boolean A2 = ((A1 % 2 >0));
        boolean B2 = ((B1 % 2 >0));
        boolean C2 = ((C1 % 2 >0));

        boolean RES = ((A2 && !B2 && !C2)||(!A2 && B2 && !C2) || (!A2&& !B2 && C2));
        System.out.println(RES);
    }
}
