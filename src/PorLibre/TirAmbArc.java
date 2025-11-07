package PorLibre;

import java.util.Locale;
import java.util.Scanner;

public class TirAmbArc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        double cateto1 = A;
        double cateto2 = B;
        double H = StrictMath.hypot(cateto1, cateto2);
        if (H<5) {
            System.out.println(5);
        } else if (H>=5 && H<10) {
            System.out.println(4);
        } else if (H>=10 && H<15) {
            System.out.println(3);
        } else if (H>=15 && H<20) {
            System.out.println(2);
        } else if (H>=20 && H<25) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
