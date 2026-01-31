package bucles;

import java.util.Locale;
import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int Contador = 0;
        if (N == 1) {
            System.out.println(0);
        } else {
            do {
                if (N % 2 == 0) {
                    N /= 2;
                } else {
                    N *= 3;
                    N += 1;
                }
                Contador++;
            } while (N > 1);
            System.out.println(Contador);

        }

    }
}
