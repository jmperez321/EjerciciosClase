package matrix;

import java.util.Locale;
import java.util.Scanner;

public class bomberman2 {
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
        int bombHorizont = 0;
        int bombVerti = 0;
        int casillaBomba = sc.nextInt();
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                if (matriz[i][j] == casillaBomba) {
                    bombHorizont = i;
                    bombVerti = j;
                }
            }
        }
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                if (i == bombHorizont || j == bombVerti) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}