package matrix;

import java.util.Locale;
import java.util.Scanner;

public class sumarfiles {
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
        for (int i = 0; i < numFiles; i++) {
            int suma = 0;
            for (int j = 0; j < numColumn; j++) {
                suma += matriz[i][j];
            }
            System.out.println(suma);
        }
    }
}