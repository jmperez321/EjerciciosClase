package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class bombermanBlocsDestruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numFiles = sc.nextInt();
        int numColumn = sc.nextInt();
        int coorX = sc.nextInt();
        int coorY = sc.nextInt();
        int rango = sc.nextInt();
        String[][] tablero = new String[numFiles][numColumn];
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                tablero[i][j] = sc.next();
            }
        }
        int blocsTrencats = 0;
        // Comprobación hacia izq desde la explosion.
        for (int i = coorY - 1; i > (coorY - 1 - rango); i--) {
            if (i >= 0) {
                if (tablero[coorX][i].equals("X")) {
                    blocsTrencats++;
                    break;
                }
            }
        }
        // Comprobación hacia derecha desde la explosion.
        for (int i = coorY + 1; i < (coorY + 1 + rango); i++) {
            if (i <= numColumn - 1) {
                if (tablero[coorX][i].equals("X")) {
                    blocsTrencats++;
                    break;
                }
            }
        }
        // Comprobacion hacia arriba
        for (int i = coorX - 1; i > (coorX - 1 - rango); i--) {
            if (i >= 0) {
                if (tablero[i][coorY].equals("X")) {
                    blocsTrencats++;
                    break;
                }
            }
        }
        // Comprobación hacia derecha desde la explosion.
        for (int i = coorX + 1; i < (coorX + 1 + rango); i++) {
            if (i <= numFiles - 1) {
                if (tablero[i][coorY].equals("X")) {
                    blocsTrencats++;
                    break;
                }
            }
        }
        System.out.println(blocsTrencats);
    }
}