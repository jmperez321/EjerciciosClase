package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class TipusdeLlibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        String TLlibre[] = new String[N];
        int Comprats[] = new int[N];

        for (int i = 0; i < N; i++) {
            TLlibre[i] = sc.next();
        }
        for (int j = 0; j < N; j++) {
            Comprats[j] = sc.nextInt();
        }

        int NumPeque = Comprats[0];
        for (int z = 0; z<N; z++){
            if (Comprats[z] < NumPeque) {
                NumPeque=Comprats[z];
            }
        }
        System.out.println("el llistat de llibres que menys tenim són:");
        for (int P=0; P < N; P++){
            if (Comprats[P]==NumPeque){
                System.out.print(TLlibre[P]+ " ");
                System.out.println(Comprats[P]);
            }
        }

    }
}

