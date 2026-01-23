package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class Progressio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Nbucle = sc.nextInt();
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int ProgOrg = Num2 - Num1;
        boolean Melon = true;

        for (int i = 0; i <= (Nbucle - 3); i++) {
            Num1 = Num2;
            Num2 = sc.nextInt();
            int ProgActual = Num2 - Num1;
            if (ProgActual != ProgOrg) {
                Melon = false;
                break;
            }
        }
        if (Melon) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }

    }
}

