package ManipulacioCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        String Nom = sc.next();
        String Cog = sc.next();
        String mayus1 = Nom.toUpperCase();
        String mayus2 = Cog.toUpperCase();

        char N1 = mayus1.charAt(0);
        char C1 = mayus2.charAt(0);

        System.out.print(N1);
        System.out.print(C1);
    }
}