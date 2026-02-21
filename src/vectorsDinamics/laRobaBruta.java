package vectorsDinamics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class laRobaBruta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<String> robaBruta = new ArrayList<>();
        List<String> robaBlanca = new ArrayList<>();
        List<String> robaNegra = new ArrayList<>();
        List<String> robaColors = new ArrayList<>();
        String roba = "";

        while (true) {
            roba = sc.nextLine();
            if (roba.equals("0")) {
                break;
            } else {
                robaBruta.add(roba);
            }
        }

        for (int i = robaBruta.size() - 1; i >= 0; i--) {
            String letra = robaBruta.get(i);
            String color = letra.substring(letra.length() - 1);
            if (color.equals("B")) {
                robaBlanca.add(robaBruta.get(i));
            } else if (color.equals("N")) {
                robaNegra.add(robaBruta.get(i));
            } else {
                robaColors.add(robaBruta.get(i));
            }
        }
        System.out.println("Cistell de la roba blanca:");
        for (int i = 0; i < robaBlanca.size(); i++) {
            System.out.println(robaBlanca.get(i).substring(0, 1));
        }
        System.out.println("\nCistell de la roba negra:");
        for (int i = 0; i < robaNegra.size(); i++) {
            System.out.println(robaNegra.get(i).substring(0, 1));
        }
        System.out.println("\nCistell de la roba de colors:");
        for (int i = 0; i < robaColors.size(); i++) {
            System.out.println(robaColors.get(i).substring(0, 1));
        }
    }
}
