package matrix2;

import java.util.Locale;
import java.util.Scanner;
// No sta terminado. Le falta algo.

public class eliminarLineaTetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int files = sc.nextInt();
        int columnes = sc.nextInt();

        int[][] casella = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                casella[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < columnes; i++) {
            boolean elimin = true;

            for (int j = 0; j < columnes; j++) {
                if (casella[i][j] == 0) {
                    elimin = false;
                    break;
                }
            }
            if (!elimin) {
                for (int j = 0; j < columnes; j++) {
                    System.out.print(casella[i][j] + " ");
                }
                System.out.println();
            }

        }

      /*  for (int i = 0; i < files; i++) {
            boolean salto = true;
            for (int j = 0; j < columnes; j++) {
               if (casella[i][0]==casella[i][j]){

               }
            }
        }*/

    }
}