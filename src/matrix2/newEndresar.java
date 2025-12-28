package matrix2;

import java.util.Locale;
import java.util.Scanner;

public class newEndresar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int longi = sc.nextInt();
        int[] arais = new int[longi];
        for (int i = 0; i < longi; i++) {
            arais[i] = sc.nextInt();
        }
        int numProv = 0;
        for (int i = 0; i < longi - 1; i++) {
            if (arais[i] > arais[i + 1]) {
                numProv = arais[i];
                arais[i + 1] = arais[i];
            }
        }
        for (int listar : arais) {
            System.out.print(listar + " ");
        }
    }
}