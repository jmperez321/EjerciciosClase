package clasesIObjetes.HolaPersona;

import java.util.Locale;
import java.util.Scanner;


class Persona {
    public void
    public void saludar(String nom) {
        String nombre=nom;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Persona unaPersona = new Persona();
        unaPersona.nom = scanner.next();
        unaPersona.saludar(nom);

        Persona unaAltraPersona = new Persona();
        unaAltraPersona.nom = scanner.next();
        unaAltraPersona.saludar(nom);
    }
}
