package EXM;

import java.util.Locale;
import java.util.Scanner;

public class EXM4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int T = sc.nextInt(); // Total sessions
        int A = sc.nextInt(); // Total  asistencia sessions

        int F = T-A; // Total Faltes
        float PF = (float)F/T;
        System.out.println("Faltes: "+F);
        System.out.println("Proporció: "+PF);

        if (PF>=0.2){
            System.out.println("Cal fer les recuperacions de juny, perquè s'ha perdut el dret a avaluació conínua.");
        } else {
            System.out.println("No s'ha perdut el dret a avaluació conínua.");
        }

    }
}
