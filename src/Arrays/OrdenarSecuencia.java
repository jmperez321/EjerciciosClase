package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class OrdenarSecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] NumSeq = new int[N];
        for (int i = 0; i < N; i++) {
            NumSeq[i] = sc.nextInt();
        }
        int NumMin =NumSeq[0];

        for (int j = 1; j<N; j++) {
            if (NumSeq[j] < NumMin) {
                NumMin = NumSeq[j];
            }
        }
        System.out.print(NumMin);
        for (int z=0;z<N;z++){

        }
        // probar a hacer el bucle doble del trobarsumands para comparar los numeros y ordenarlos.
    }
}
