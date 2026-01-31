package bucles;

import java.util.Locale;
import java.util.Scanner;

public class Fibonac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Pool = sc.nextInt();
        int Contador = 0;
        int Num1 = 0;
        int Num2 = 1;
        int Num3 = Num2 + Num1;
        if (Pool == 1) {
            System.out.print(1);
        } else if (Pool == 2) {
            System.out.print(1 + " " + Num2);
        } else {
            while (Contador < Pool) {
                System.out.print(Num3 + " ");
                Contador++;
                Num3 = Num1 + Num2;
                Num1 = Num2;
                Num2 = Num3;
            }
        }
    }
}
