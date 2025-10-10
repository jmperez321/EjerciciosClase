package OperadorsAritmetics;

import java.util.Locale;
import java.util.Scanner;

public class trainbird {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Dt = sc.nextFloat();
        float Vt = sc.nextFloat();
        float Vb = sc.nextFloat();

        // float Tt = Vt/Dt;
        float Db = Dt/Vt*Vb;

        System.out.println(Db);
    }
}
