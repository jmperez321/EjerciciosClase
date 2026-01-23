package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class GeneradorDeCorrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        while ((Num1 != 0) || (Num2 != 0)) {
            if (Num2 <= Num1) {
                System.out.println("INCORRECTE");
                break;
            }
            Num1 = Num2;
            Num2 = sc.nextInt();
            if (Num2 == 0) {
                System.out.println("CORRECTE");
                break;
            }
            if (Num2 >= Num1) {
                System.out.println("INCORRECTE");
                break;
            }
            Num1 = Num2;
            Num2 = sc.nextInt();
            if (Num2 == 0) {
                System.out.println("CORRECTE");
                break;
            }
        }
    }
}

