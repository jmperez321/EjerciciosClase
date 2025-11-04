package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class ControlFerroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        boolean F = sc.nextBoolean();
        sc.nextLine();
        int C = sc.nextInt();

        System.out.println("Estat del semàfor (vermell, ambar, verd):");
        System.out.println("Fre d'emergència? (true, false):");
        System.out.println("Ordres del centre de control (0, 1, 2):");
        if (( S.equals("verd") || S.equals("àmbar"))  && !F && C==0) {
            System.out.println("El tren pot continuar");
        } else {
            System.out.println("El tren s'ha d'aturar!!");
        }
    }
}
