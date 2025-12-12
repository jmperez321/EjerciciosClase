package matrix;

import java.util.Locale;
import java.util.Scanner;

public class matrixsubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numColumn = sc.nextInt();
        String[][] matriz = new String[numColumn][numColumn];
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numColumn; j++) {
                matriz[i][j] = sc.next();
            }
        }
        int numInicio = sc.nextInt();
        int numFinal = sc.nextInt();

        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numColumn; j++) {
                if (matriz[i][j].length() - 1 < numFinal) {
                    System.out.print("<ERROR>" + " ");
                } else {
                    String soloLetras = matriz[i][j].substring(numInicio, numFinal);
                    System.out.print(soloLetras + " ");
                }
            }
            System.out.println();
        }
    }
}