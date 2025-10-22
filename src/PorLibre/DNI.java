package PorLibre;

import java.util.Locale;
import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int DNI = sc.nextInt();
        String TablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Tabla de letras.

        int Rest = DNI % 23; // El DNI se divide entre 23 y el resto es la posición.
        char L = TablaLetras.charAt(Rest); // Muestra la Letra del DNI

        System.out.println(L);
    }
}
