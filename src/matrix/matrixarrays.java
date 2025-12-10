package matrix;

import java.util.Locale;
import java.util.Scanner;

public class matrixarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numFiles = sc.nextInt();
        int numColumn = sc.nextInt();
        int[][] matriz = new int[numFiles][numColumn];
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int zeros = 0;
        int unos = 0;

        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                if (matriz[i][j] == 1) {
                    unos++;
                } else {
                    zeros++;
                }

            }
        }
        System.out.println(zeros + " " + unos);
    }
}