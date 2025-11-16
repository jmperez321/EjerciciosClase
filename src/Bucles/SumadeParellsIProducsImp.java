package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class SumadeParellsIProducsImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        int Num = sc.nextInt();
        int Parell = 0;
        int Impar = 1;
        int NumTotals = 0;
        while (Num!=-1) {
            if (Num % 2 == 0) {
                Parell +=Num;
            } else if (Num%2!=0){
                Impar *= Num;
            }
            NumTotals +=1;
            Num = sc.nextInt();
        }
        System.out.println(Parell);
        System.out.println(Impar);
        System.out.println(NumTotals);
    }
}