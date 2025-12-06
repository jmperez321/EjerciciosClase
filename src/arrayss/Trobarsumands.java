package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class Trobarsumands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ResSuma = sc.nextInt();
        int N = sc.nextInt();
        int[] NumSeq = new int[N];
        for (int i = 0; i < N; i++) {
            NumSeq[i] = sc.nextInt();
        }

        for (int j = 0; j < N; j++) {
            for (int z = 0; z < N; z++) {
                if (NumSeq[j] == NumSeq[z]) {
                    continue;
                }
                if ((NumSeq[j] + NumSeq[z]) == ResSuma) {
                    System.out.println(NumSeq[j] + " " + NumSeq[z]);
                    return;
                }
            }
        }
        System.out.println("-1 -1");
    }
}
