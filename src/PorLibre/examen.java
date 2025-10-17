package PorLibre;

import java.util.Locale;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Np = sc.nextFloat();
        float Ne = sc.nextFloat();

        float Nota = (Np * 0.4f) + (Ne * 0.6f);
        boolean Nf = Nota > 5;

        System.out.println(Nf);
    }
}