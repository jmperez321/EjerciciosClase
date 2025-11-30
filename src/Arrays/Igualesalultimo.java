package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Igualesalultimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int [] Num = new int[N];
        for (int i =0; i<N; i++){
             Num[i] = sc.nextInt();
        }
        int ContIgual = 0;
        for (int j = 0; j<N-1;j++){
            if (Num[j]==Num[N-1]){
                ContIgual++;
            }
        }
        System.out.println(ContIgual);
    }
}

