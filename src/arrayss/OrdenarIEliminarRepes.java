package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class OrdenarIEliminarRepes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] numEntrada = new int[N];
        for (int i = 0; i < N; i++) {
            numEntrada[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (numEntrada[j] > numEntrada[j + 1]) {
                    int numProv = numEntrada[j];
                    numEntrada[j] = numEntrada[j + 1];
                    numEntrada[j + 1] = numProv;
                }
            }
        }
        Integer[] numSinDupes = new Integer[N];
        int contadorElemen = 0;
        for (Integer echNumEntrada : numEntrada) {
            boolean existe = false;
            for (int i = 0; i < N; i++) {
                if (echNumEntrada.equals(numSinDupes[i])) {
                    existe = true;
                }
            }
            if (!existe) {
                numSinDupes[contadorElemen] = echNumEntrada;
                contadorElemen++;
            }
        }
        for (Integer eachNoRepes : numSinDupes) {
            if (eachNoRepes != null) {
                System.out.print(eachNoRepes + " ");
            }
        }
    }
}