package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int comensals = sc.nextInt();   // Cantidad de comensales
        float parros = sc.nextFloat();  // Precio/Kg (1pers=0,125kg)
        float pgambes = sc.nextFloat(); // Precio/Kg (1pers=0,0625kg)

        System.out.println(estimacioArros(comensals) + " kg arros");
        System.out.println(estimacioGamb(comensals) + " kg gambes");
        System.out.println(preuArros(parros, comensals) + " euros arros");
        System.out.println(preuGamb(pgambes, comensals) + " euros gambes");
        System.out.println("TOTAL: " + preuTotal(parros, pgambes, comensals) + " euros");
    }

    public static float estimacioArros(int com) {
        return com * 0.125f;
    }

    public static float estimacioGamb(int com) {
        return com * 0.0625f;
    }

    public static float preuArros(float pArros, int com) {
        return (com * 0.125f) * pArros;
    }

    public static float preuGamb(float pGamb, int com) {
        return (com * 0.0625f) * pGamb;
    }

    public static float preuTotal(float pArros, float pGamb, int com) {
        return ((com * 0.125f) * pArros) + ((com * 0.0625f) * pGamb);
    }


}
