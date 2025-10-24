package PorLibre;

import java.util.Locale;
import java.util.Scanner;

public class PauPauPauPau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String PAU = sc.nextLine();

        //INputs: hsau872sjhaKJ i shkajh27jhsam

        String perro =PAU.replaceAll("[0-9]","");
        String mayusQlero = perro.toUpperCase();
        System.out.println(mayusQlero);

    }
}
