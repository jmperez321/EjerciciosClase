package matrix;

import java.util.Locale;
import java.util.Scanner;

public class buscandominas {
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
        int movI = sc.nextInt();
        int movJ = sc.nextInt();

        while (movI != 0 && movJ != 0) {
            if (matriz[movI - 1][movJ - 1] == 1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            movI = sc.nextInt();
            movJ = sc.nextInt();
        }
    }
}