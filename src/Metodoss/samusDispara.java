package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class samusDispara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[][] mapa = llegirMapa(sc);
        String dir = sc.next();

        if (dir.equals("→")) {
            disparDreta(mapa);
        } else {
            disparAmunt(mapa);
        }
    }

    public static String[][] llegirMapa(Scanner sc) {

        String[][] mapa = new String[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = sc.next();
            }
        }
        return mapa;
    }

    public static void disparDreta(String[][] mapa) {
        for (int j = 1; j < mapa[0].length; j++) {
            if (mapa[mapa.length - 1][j].equals("#")) {
                System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un obstacle.");
                return;
            } else if (mapa[mapa.length - 1][j].equals("&")) {
                System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un enemic.");
                return;
            }
        }
        System.out.println("La Samus ha disparat en línia recta cap a la dreta i no ha impactat amb res.");
    }

    public static void disparAmunt(String[][] mapa) {
        for (int i = mapa.length - 2; i >= 0; i--) {
            if (mapa[i][0].equals("#")) {
                System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un obstacle.");
                return;
            } else if (mapa[i][0].equals("&")) {
                System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un enemic.");
                return;
            }
        }
        System.out.println("La Samus ha disparat en línia recta cap amunt i no ha impactat amb res.");
    }
}