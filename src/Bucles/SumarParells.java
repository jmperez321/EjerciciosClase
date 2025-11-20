package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class SumarParells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int CantNum = sc.nextInt();
        sc.nextLine();
        int Subtotal =0;

        for (int A = 1;A<=CantNum;A++){
            int Num = sc.nextInt();
            if (Num%2==0){
                Subtotal=Subtotal+Num;
            }
        }
        System.out.println(Subtotal);
    }
}

