package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class LligaDeFutbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        // Equipo A
        int Ga = sc.nextInt();      // Partidos Ganados
        int Ea = sc.nextInt();      // Partidos Empatados
        int Pa = sc.nextInt();      // Partidos Perdidos
        int GOLa = sc.nextInt();    // Goles a favor
        int NGOLa = sc.nextInt();   // Goles en contra
        // Equipo B
        int Gb = sc.nextInt();      // Partidos Ganados
        int Eb = sc.nextInt();      // Partidos Empatados
        int Pb = sc.nextInt();      // Partidos Perdidos
        int GOLb = sc.nextInt();    // Goles a favor
        int NGOLb = sc.nextInt();   // Goles en contra

        int Sa = (Ga * 3) + Ea;         // Score A
        int Sb = (Gb * 3) + Eb;         // Score B
        int TGOLa = (GOLa - NGOLa);
        int TGOLb = (GOLb - NGOLb);
        if ((Sa == Sb) && TGOLa > TGOLb) {
            System.out.println("true");
        } else if ((Sa > Sb)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
