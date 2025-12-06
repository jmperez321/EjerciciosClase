package arrayss;

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

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (NumSeq[j] > NumSeq[j + 1]) {
                    int NumProv = NumSeq[j];
                    NumSeq[j] = NumSeq[j + 1];
                    NumSeq[j + 1] = NumProv;
                }
            }
        }
        for (int z = 0; z < N; z++) {
            System.out.print(NumSeq[z] + " ");
        }
    }
}
