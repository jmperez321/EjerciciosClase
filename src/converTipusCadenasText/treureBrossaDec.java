package converTipusCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class treureBrossaDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1 = sc.nextLine();
        String P2 = sc.nextLine();

        String P1a = P1.substring(1); // Empieza a contar desde el segundo caracter ignorando el caracter 0
        int P2L = P2.length() - 2; // Esta linea cuenta la longitud de la palabra y le resta 2 caracteres.
        String P2a = P2.substring(0, P2L); // Cuenta desde el inicio hasta la longitud de la palabra-2 caracteres.

        float PP1 = Float.parseFloat(P1a);
        float PP2 = Float.parseFloat(P2a);

        System.out.println(PP1 + PP2);
    }
}
