package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class AturaElTren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        int P = sc.nextInt();
        sc.nextLine();
        boolean O = sc.nextBoolean();

        if (S.equals("vermell") || P > 0 && O) {
            System.out.println("ATURAR");
        } else {
            System.out.println("CONTINUAR");
        }
    }
}