package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class escalaDeCartes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] numEntrada = new int[N];
        for (int i = 0; i < N; i++) {
            numEntrada[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (numEntrada[j] < numEntrada[j + 1]) {
                    int NumProv = numEntrada[j];
                    numEntrada[j] = numEntrada[j + 1];
                    numEntrada[j + 1] = NumProv;
                }
            }
        }
        for (int each : numEntrada) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("La carta més gran és: " + numEntrada[0]);
        System.out.println("La carta més petita és: " + numEntrada[N - 1]);
        if (N != 1) {
            if (N % 2 != 0) {
                System.out.println("La carta del mig és: " + numEntrada[1]);
            } else {
                System.out.println("La carta del mig és: " + numEntrada[2]);
            }
        } else {
            System.out.println("La carta del mig és: " + numEntrada[0]);
        }
        boolean escalera = true;
        for (int i = 0; i < N; i++) {
            if (N == 1) {
                escalera = true;
            } else if (i + 1 >= numEntrada.length) {
                break;
            } else if (numEntrada[i] - 1 != numEntrada[i + 1]) {
                escalera = false;
                break;
            }
        }
        if (escalera) {
            System.out.println("Es tracta d'una escala: SI");
        } else {
            System.out.println("Es tracta d'una escala: NO");
        }
    }
}

