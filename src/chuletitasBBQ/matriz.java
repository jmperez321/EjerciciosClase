package chuletitasBBQ;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Bucle para recoger imput de una matriz

        int numColumn = sc.nextInt();
        int numFiles = sc.nextInt();
        int[][] matriz = new int[numColumn][numFiles];
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numFiles; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

    }
}