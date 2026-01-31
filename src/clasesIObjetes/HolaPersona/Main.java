package clasesIObjetes.HolaPersona;

import java.util.Locale;
import java.util.Scanner;


class Persona {
    String nom;

    public void saludar() {
        System.out.println("Hola, em dic " + nom);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Persona unaPersona = new Persona();
        unaPersona.nom = sc.next();
        unaPersona.saludar();

        Persona unaAltraPersona = new Persona();
        unaAltraPersona.nom = sc.next();
        unaAltraPersona.saludar();
    }
}
