package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class PreuDelFer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float V = sc.nextFloat();
        int D = sc.nextInt();
        float P = 0.35f;

        if (D > 7 && V > 800f) {
            float B = V * P * 0.7f;
            System.out.println(B);
        } else {
            float B = V * P;
            System.out.println(B);
        }

    }
}
