package OperadorsLogics;

import java.util.Locale;
import java.util.Scanner;

public class Contractarprogramad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Boolean J1 = sc.nextBoolean();
        int J2 = sc.nextInt();
        sc.nextLine();
        Boolean P1 = sc.nextBoolean();
        int P2 = sc.nextInt();
        Boolean J2xp = J2 >= 1;
        Boolean P2xp = P2 >= 3;

        Boolean J3 = J2xp && J1;
        Boolean P3 = P2xp && P1;
        Boolean RES = J3 || P3;

        System.out.println(RES);

    }
}
