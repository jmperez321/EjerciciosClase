package matrix;
//No esta hecho.

import java.util.Locale;
import java.util.Scanner;

public class matrixlowerupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numDim = sc.nextInt();
        String[][] matriz = new String[numDim][numDim];
        for (int i = 0; i < numDim; i++) {
            for (int j = 0; j < numDim; j++) {
                matriz[i][j] = sc.next();
            }
        }

    }
}