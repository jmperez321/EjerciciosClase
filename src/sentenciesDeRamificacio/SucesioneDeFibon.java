package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class SucesioneDeFibon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int NumDeSeries = sc.nextInt();

        boolean Status = true;
        boolean bool = false;

        while (NumDeSeries != 0) {
            int Num1 = sc.nextInt();
            int Num2 = sc.nextInt();
            if (Num1 == 0) {
                while (Status = true) {
                    if (Num1 + Num2 == sc.nextInt()) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                    Num1 = Num2;
                    Num2 = sc.nextInt();
                    if (Num2 == -1) {
                        Status = false;
                    }
                }
            } else {
                while (Status = true) {
                    if (Num1 + Num2 == sc.nextInt()) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                    Num1 = Num2;
                    Num2 = sc.nextInt();
                    if (Num2 == -1) {
                        break;
                    }
                }
            }

            NumDeSeries -= 1;
            System.out.println(bool);
        }
    }
}