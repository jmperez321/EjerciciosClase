package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class DivIMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Num1 = sc.nextFloat();
        float Num2 = sc.nextFloat();

        float ContA= Num1;
        float Cosa=Num1;

        while (ContA<=Num2) {
            Cosa++;
            System.out.print(Num1+" ");
            if (Cosa!=0) {
                if (Cosa % 2 == 0) {
                    Num1 = Num1/Cosa;
                } else if (Cosa%2!=0){
                    Num1 = Num1*Cosa;
                }
            }
            ContA++;
        }

    }
}

