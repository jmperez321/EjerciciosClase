package matrix;
//no esta terminado

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
        sc.nextLine();
        for (int i = 0; i < numDim; i++) {
            for (int j = 0; j < numDim; j++) {
                String linia = sc.nextLine();
                String[] array = linia.split(" ");
                for (String str : array) {
                    int num = Integer.parseInt(str);
                    String paraula = matriz[i][j];

                    if (num >= 0 && num < paraula.length()) {
                        //mayus
                        paraula = paraula.substring(0, num) +
                                paraula.substring(num, num + 1).toUpperCase() +
                                paraula.substring(num + 1);

                    } else if (num < 0 && num * -1 < paraula.length()) {
                        //minusc
                        num *= -1;
                        paraula = paraula.substring(0, num) +
                                paraula.substring(num, num + 1).toLowerCase() +
                                paraula.substring(num + 1);
                    }
                    matriz[i][j] = paraula;

                }
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
    }
}