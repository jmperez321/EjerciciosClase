package matrix;

import java.util.Locale;
import java.util.Scanner;


public class sumarcolumnes {
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

        for (int j = 0; j < numColumn; j++) {
            int numComp = matriz[0][j];
            for (int i = 1; i < numFiles; i++) {
                numComp += matriz[i][j];
            }
            System.out.print(numComp + " ");
        }

    }
}