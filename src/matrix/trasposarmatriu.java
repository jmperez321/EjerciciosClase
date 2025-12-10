package matrix;

import java.util.Locale;
import java.util.Scanner;


public class trasposarmatriu {
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
            for (int i = 0; i < numFiles; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}