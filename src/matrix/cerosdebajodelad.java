package matrix;

import java.util.Locale;
import java.util.Scanner;

public class cerosdebajodelad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numColumn = sc.nextInt();
        int[][] matriz = new int[numColumn][numColumn];
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numColumn; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        boolean todoceros = true;
        int numProg = 0;
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numProg; j++) {
                if (matriz[i][j] != 0) {
                    todoceros = false;
                    break;
                }
            }
            numProg++;
        }
        if (todoceros) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}