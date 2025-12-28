package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class blockPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int files = sc.nextInt();
        int columnes = sc.nextInt();

        int[][] casella = new int[files][columnes];
        int[][] tableroFinal = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                casella[i][j] = sc.nextInt();
                tableroFinal[i][j] = casella[i][j];

            }
        }
        int[][] pieza = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                pieza[i][j] = sc.nextInt();
            }
        }
        boolean fallo = true;
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (tableroFinal[i][j] > 0 && pieza[i][j] > 0) {
                    fallo = false;
                }
                if (tableroFinal[i][j] == 0) {
                    if (pieza[i][j] > 0) {
                        tableroFinal[i][j] = pieza[i][j];
                    }
                }
            }
        }
        System.out.println(fallo);
    }
}