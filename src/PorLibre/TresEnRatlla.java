package PorLibre;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class TresEnRatlla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();

        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();

        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        int C3 = sc.nextInt();

        if ((A1==1 && A2==1 && A3==1)||(B1==1 && B2==1 && B3==1)||(C1==1 && C2==1 && C3==1)||(A1==1 && B2==1 && C3==1)||(A3==1 && B2==1 && C1==1)||(A1==1 && B1==1 && C1==1)||(A2==1 && B2==1 && C2==1)||(A3==1 && B3==1 && C3==1)){
            System.out.println("Jugador1");
        } else if ((A1==2 && A2==2 && A3==2)||(B1==2 && B2==2 && B3==2)||(C1==2 && C2==2 && C3==2)||(A1==2 && B2==2 && C3==2)||(A3==2 && B2==2 && C1==2)||(A1==2 && B1==2 && C1==2)||(A2==2 && B2==2 && C2==2)||(A3==2 && B3==2 && C3==2)){
            System.out.println("Jugador2");
        } else{
            System.out.println("Empat");
        }

    }
}
