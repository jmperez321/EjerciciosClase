package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class Dossecuencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] Num1 = new int[N];
        for (int i = 0; i < N; i++) {
            Num1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] Num2 = new int[M];
        for (int j = 0; j < M; j++) {
            Num2[j] = sc.nextInt();
        }
        int LNum1 = Num1.length;
        int LNum2 = Num2.length;
        boolean Resultado = true;
        if (LNum1 != LNum2) {
            Resultado = false;
        } else {
            for (int z = 0; z < N; z++) {
                if (Num1[z] == Num2[z]) {
                    Resultado = true;
                } else {
                    Resultado = false;
                }
            }
        }
        System.out.println(Resultado);
    }
}