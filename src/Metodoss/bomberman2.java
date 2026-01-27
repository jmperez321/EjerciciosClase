package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class bomberman2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numFiles = sc.nextInt();
        int numColumn = sc.nextInt();

        int[][] matriz = llegirMatriu(sc, numColumn, numFiles);
        int casillaBomba = sc.nextInt();
        int[] coordenada = onEsLaBomba(casillaBomba, matriz);
        int bombRow = coordenada[0];
        int bombCol = coordenada[1];

        printMapa(bombRow, bombCol, matriz);

    }

    public static int[][] llegirMatriu(Scanner sc, int numColumn, int numFiles) {
        int[][] matriz = new int[numFiles][numColumn];
        for (int i = 0; i < numFiles; i++) {
            for (int j = 0; j < numColumn; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int[] onEsLaBomba(int idBomba, int[][] matriu) {
        int bombRow = -1;
        int bombCol = -1;
        //id epicentro exp
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (matriu[i][j] == idBomba) {
                    bombRow = i;
                    bombCol = j;
                }
            }
        }
        int[] coordenada = {bombRow, bombCol};
        return coordenada;
    }

    public static void printMapa(int row, int col, int[][] matri) {
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                if (i == row || j == col) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
