package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class Fibonac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Pool = sc.nextInt();
        int Contador = 0;
            if (Contador==0) {
                System.out.print(1+" ");
            } else if (Contador==1) {
                System.out.print(1+" "+1);
            }else{
                while (Contador<Pool){
                    System.out.print(+" ");
                    Contador++;
            }
        }

        /*int Num2 = 0;
        int Num3 = 0;
        *//*System.out.print(1);
        for (int A =0;A==Pool;A++){
            Num2=Num2+A;
            Num3=Num2+A;
            if (Num2>0){
                System.out.print(Num2);
            }
            if (Num3>0){
                System.out.print(Num3);
            }
            System.out.print(A);*//*
        }*/
    }
}
