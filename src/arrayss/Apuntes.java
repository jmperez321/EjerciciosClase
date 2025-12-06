package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class Apuntes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        int Pag[] = new int[N];
        String Frase[] = new String[N];

        for (int i = 0; i < N; i++) {
            Pag[i] = sc.nextInt();
            Frase[i] = sc.nextLine();
        }

        int PagOrdenada[] = new int[N];
        String FraseOrdenada[] = new String[N];

        for (int j = 0; j < N; j++) {
            int a = Pag[j];
            PagOrdenada[a - 1] = Pag[j];
            FraseOrdenada[a - 1] = Frase[j];
        }

        for (int z = 0; z < N; z++) {
            System.out.print(PagOrdenada[z] + " ");
            System.out.println(FraseOrdenada[z]);
        }

    }
}