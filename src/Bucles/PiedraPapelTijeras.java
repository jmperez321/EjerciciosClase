package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int PJ1 = 0;
        int PJ2 = 0;

        String Round = sc.nextLine();
        while (!Round.equals("END")) {
            if (Round.equals("@%") || Round.equals("#@") || Round.equals("%#")) {
                PJ1++;
            } else if (Round.equals("%@") || Round.equals("#%") || Round.equals("@#")) {
                PJ2++;
            }
            Round = sc.nextLine();
        }
        if (PJ1>PJ2){
            System.out.println(1);
        } else if (PJ1<PJ2) {
            System.out.println(2);
        } else {
            System.out.println("-");
        }
    }
}