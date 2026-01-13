package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class oxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[][] casella = new String[3][3];
        for (int i = 0; i < 3; i++) {
            String fila = sc.next();
            for (int j = 0; j < 3; j++) {
                casella[i][j] = String.valueOf(fila.charAt(j));
            }
        }
        String ganador = "-";
        // Filas
        for (int i = 0; i < 3; i++) {
            if (casella[i][0].equals(casella[i][1]) &&
                    casella[i][1].equals(casella[i][2]) &&
                    !casella[i][0].equals("-")) {
                ganador = casella[i][0];
            }
        }

        // Columnas
        for (int j = 0; j < 3; j++) {
            if (casella[0][j].equals(casella[1][j]) &&
                    casella[1][j].equals(casella[2][j]) &&
                    !casella[0][j].equals("-")) {
                ganador = casella[0][j];
            }
        }

        // Diagonal principal
        if (casella[0][0].equals(casella[1][1]) &&
                casella[1][1].equals(casella[2][2]) &&
                !casella[0][0].equals("-")) {
            ganador = casella[0][0];
        }

        // Diagonal secundaria
        if (casella[0][2].equals(casella[1][1]) &&
                casella[1][1].equals(casella[2][0]) &&
                !casella[0][2].equals("-")) {
            ganador = casella[0][2];
        }

        System.out.println(ganador);
    }
}