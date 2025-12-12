package matrix;

import java.util.Locale;
import java.util.Scanner;

public class samusdispara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numColumn = sc.nextInt();
        int numFiles = sc.nextInt();

        String[][] matriz = new String[numColumn][numFiles];
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numFiles; j++) {
                matriz[i][j] = sc.next();
            }
        }
        int samusHor = 0;
        int samusVer = numColumn - 1;
        String direccioTret = sc.next();
        if (direccioTret.equals("↑")) {
            for (int i = 0; i < samusVer; i++) {
                String deteccio = matriz[i][samusHor];
                if (deteccio.equals("#")) {
                    System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un obstacle.");
                } else if (deteccio.equals("&")) {
                    System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un enemic.");
                } else if (!deteccio.equals("#") && !deteccio.equals("&")) {
                    System.out.println("La Samus ha disparat en línia recta cap amunt i no ha impactat amb res.");
                }
            }
        }
        if (direccioTret.equals("→")) {
            for (int i = 0; i < numFiles; i++) {
                String deteccio = matriz[samusVer][i];
                if (deteccio.equals("#")) {
                    System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un obstacle.");
                } else if (deteccio.equals("&")) {
                    System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un enemic.");
                } else {
                    System.out.println("La Samus ha disparat en línia recta cap a la dreta i no ha impactat amb res.");
                }
            }
        }
    }
}