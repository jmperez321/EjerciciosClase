package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class ControlDeQualitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean T = sc.nextBoolean();
        boolean R = sc.nextBoolean();
        boolean M = sc.nextBoolean();
        boolean E = sc.nextBoolean();
        boolean L = sc.nextBoolean();

        if (T){
            System.out.println("L'estat del txasis es: correcte");
        } else {
            System.out.println("L'estat del txasis es: defectuos");
        }
        if (R){
            System.out.println("L'estat de les rodes es: correcte");
        } else {
            System.out.println("L'estat de les rodes es: defectuos");
        }
        if (M){
            System.out.println("L'estat del motor es: correcte");
        } else {
            System.out.println("L'estat del motor es: defectuos");
        }
        if (E){
            System.out.println("L'estat de l'electronica es: correcte");
        } else {
            System.out.println("L'estat de l'electronica es: defectuos");
        }
        if (L){
            System.out.println("L'estat del llums es: correcte");
        } else {
            System.out.println("L'estat del llums es: defectuos");
        }
        if (T && R && M && E && L){
            System.out.println("L'estat general del cotxe es: correcte");
        } else {
            System.out.println("L'estat general del cotxe es: defectuos");
        }

    }
}
