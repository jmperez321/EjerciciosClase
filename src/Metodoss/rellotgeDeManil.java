package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class rellotgeDeManil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int SS = sc.nextInt();

        float gs = gradosSegundos(SS);
        float gm = gradosMinutos(MM, SS);
        float gh = gradosHoras(HH, MM, SS);

        System.out.println(gh);
        System.out.println(gm);
        System.out.println(gs);
    }

    public static float gradosSegundos(int SS) {
        return SS * 6;
    }

    public static float gradosMinutos(int MM, int SS) {
        return MM * 6 + 0.1f * SS;
    }

    public static float gradosHoras(int HH, int MM, int SS) {
        return HH * 30 + 0.5f * MM + (0.5f / 60) * SS;
    }

}
