package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class Alturaminima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NH = sc.nextInt();
        float[] Alturas = new float[NH];
        for (int i = 0; i < NH; i++) {
            Alturas[i] = sc.nextFloat();
        }
        sc.nextLine();
        float Hmin = sc.nextFloat();

        for (int j = 0; j < NH; j++) {
            if (Alturas[j] >= Hmin) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}

