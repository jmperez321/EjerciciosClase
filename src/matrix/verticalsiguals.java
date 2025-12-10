package matrix;

import java.util.Locale;
import java.util.Scanner;

// BNO ESTA  TERMINADO
public class verticalsiguals {
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
        boolean iguals = false;
        for (int i = 0; i < numFiles; i++) {
            int numComp = matriz[0][i];
            for (int j = 1; j < numColumn; j++) {
                if (numComp != matriz[j][i]) {
                    break;
                } else if (numComp == matriz[j][i]) {

                }

            }
        }


    }
}