package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class stigidsert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();

        int n1 = numero/100;
        int n3 = numero%10;
        int n2 = (numero-(n1*100+n3))/10;
        int res = (n3*100 + n2*10 + n1);
        System.out.println(res);

    }
}
