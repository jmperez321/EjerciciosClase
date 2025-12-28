package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class matriucapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean capicua = false;
        int matrixTamany = sc.nextInt();
        String[][] paraula = new String[matrixTamany][matrixTamany];
        for (int i = 0; i < matrixTamany; i++) {
            for (int j = 0; j < matrixTamany; j++) {
                paraula[i][j] = sc.next();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int longParaula = paraula[x][y].length() - 1;
        int k = 0;
        while (k < longParaula) {
            /*int P1 = paraula[x][y].charAt(k);
            int P2 = paraula[x][y].charAt(longParaula);*/

            if (paraula[x][y].charAt(k) == paraula[x][y].charAt(longParaula)) {
                capicua = true;
            } else {
                capicua = false;
            }
            k++;
            longParaula--;
        }


        System.out.println(capicua);
    }
}