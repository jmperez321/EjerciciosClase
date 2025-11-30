package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Buscarlletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String Frase = sc.nextLine();
        int N = Frase.length();
        char[] Frasecita = Frase.toCharArray();
        char Letra = sc.next().charAt(0);
        int CuentaLetras=0;
        for (int i=0;i<N; i++){
            if (Frasecita[i]==Letra) {
                CuentaLetras++;
            }
        }
        System.out.println(CuentaLetras);
    }
}