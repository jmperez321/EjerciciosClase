package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class creuParellOSenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        //recull el valors de la cuadricula
        int[][] casella = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                casella[i][j] = sc.nextInt();
            }
        }
        // Saber si busquem Parell o Senar
        boolean parell = sc.nextBoolean();
        //Busca la fila central
        int filaCentral = N / 2;
        /*if (N % 3 == 0) {
            filaCentral = (N / 3);
        } else {
            filaCentral = (N / 3) + 1;
        }*/
        boolean res = true;
        if (parell) {
            for (int i = 0; i < N; i++) {
                if (casella[i][filaCentral] % 2 != 0) {
                    res = false;
                }
            }
            for (int j = 0; j < N; j++) {
                if (casella[filaCentral][j] % 2 != 0) {
                    res = false;
                }
            }
        }
        if (!parell) {
            for (int i = 0; i < N; i++) {
                if (casella[i][filaCentral] % 2 == 0) {
                    res = false;
                }
            }
            for (int j = 0; j < N; j++) {
                if (casella[filaCentral][j] % 2 == 0) {
                    res = false;
                }
            }
        }
        System.out.println(res);
    }
}