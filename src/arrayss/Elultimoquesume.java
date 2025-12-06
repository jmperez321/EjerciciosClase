package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class Elultimoquesume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] Num = new int[N];
        for (int i = 0; i < N; i++) {
            Num[i] = sc.nextInt();
        }
        for (int j = 0; j < N; j++) {
            System.out.print(Num[j] + Num[N - 1] + " ");
        }
    }
}