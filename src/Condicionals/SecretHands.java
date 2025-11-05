package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class SecretHands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int Num = ((A*1000)+(B*100)+(C*10)+D);

        if (Num==0001){
            System.out.println("fer l'ullet");
        } else if (Num==0010) {
            System.out.println("doble parpalleig");
        } else if (Num == 0011) {
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        } else if (Num == 0100) {
            System.out.println("tancar els ulls");
        } else if (Num == 0101) {
            System.out.println("doble parpalleig");
            System.out.println("fer l'ullet");
        } else if (Num == 0110) {
            System.out.println("fer l'ullet");
            System.out.println("doble parpalleig");
        } else if (Num == 0111) {
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        } else if (Num == 1000) {
            System.out.println("saltar");
        } else if (Num == 1001) {
            System.out.println("tancar els ulls");
            System.out.println("fer l'ullet");
        } else if (Num == 1010) {
            System.out.println("doble parpalleig");
            System.out.println("doble parpalleig");
        } else if (Num == 1011) {
            System.out.println("doble parpalleig");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        } else if (Num == 1100) {
            System.out.println("fer l'ullet");
            System.out.println("tancar els ulls");
        } else if (Num == 1101) {
            System.out.println("fer l'ullet");
            System.out.println("doble parpalleig");
            System.out.println("fer l'ullet");
        } else if (Num == 1110) {
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("doble parpalleig");
        } else if (Num == 1111) {
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        }

    }
}
