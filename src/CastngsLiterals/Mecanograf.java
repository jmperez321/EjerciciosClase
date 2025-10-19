package CastngsLiterals;

import java.util.Locale;
import java.util.Scanner;

public class Mecanograf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int X = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int P = (X-B)*100/X;
        System.out.println(P);

        float Palab = X/5f;
        float tMin = C/60f;
        float RPP = (int)(Palab / tMin);
        System.out.println((int)RPP);
    }
}
