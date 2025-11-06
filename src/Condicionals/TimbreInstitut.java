package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class TimbreInstitut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int M = sc.nextInt();
        String A = sc.nextLine();

        if (A.equals(" automatic")) {
            if (M == 0) {
                System.out.println("RING");
            } else {
                System.out.println("---");
            }
        }
        else if (A.equals(" manual")) {
            System.out.println("RING");
        }
        else if (A.equals(" alarma")) {
            System.out.println("RING RING RING");
        }
        else {
            System.out.println("---");
        }
    }
}