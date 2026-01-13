package chuletitasBBQ;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Bucle para recoger imput de una matriz

        int files = sc.nextInt();
        int column = sc.nextInt();
        int[][] matriz = new int[files][column];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        //Matriz: Recoger caracter por caracter de un String
        String[][] casella = new String[3][3];
        for (int i = 0; i < 3; i++) {
            String fila = sc.next();
            for (int j = 0; j < 3; j++) {
                casella[i][j] = String.valueOf(fila.charAt(j));
            }
        }


        // Listar los datos de la matriz
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}