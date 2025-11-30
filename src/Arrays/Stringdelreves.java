package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Stringdelreves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String Frase = sc.nextLine();
        int N = Frase.length();
        char[] Frasecita = Frase.toCharArray();

        for (int j = 0; j<N; j++) {
            int sub = N-1-j;
            System.out.print(Frasecita[sub]);
        }
    }
}