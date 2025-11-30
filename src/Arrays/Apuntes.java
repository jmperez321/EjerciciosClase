package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Apuntes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        String [] Frase = new String[N];
        for (int i =0; i<N; i++){
            Frase[i] = sc.nextLine();
        }
        String [] Apuntes = new String[N];
        for (int j =0; j<N;j++) {
            int Cont = 0;
            int Pag = Integer.parseInt(Frase[Cont].substring(0, 1));
            Cont++;
            Apuntes[Pag]=Frase[j];
        }
        for (int z = 0; z<N;z++){
            System.out.println(Apuntes[z]);
        }
    }
}