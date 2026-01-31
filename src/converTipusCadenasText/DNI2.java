package converTipusCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class DNI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String DNI = sc.nextLine();
        String TablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Tabla de letras.

        String NDNI = DNI.substring(0, 8);
        char NumeroDNi = DNI.charAt(8);

        int NDNI2 = Integer.parseInt(NDNI); // Convertir el string a int
        int Rest = NDNI2 % 23; // El numero del DNI se divide entre 23 y el resto es la posición.
        char L = TablaLetras.charAt(Rest); // Crea la variable con la Letra del DNI segun el Modulo

        boolean fin = (L == NumeroDNi);


        System.out.println(fin);
    }
}
