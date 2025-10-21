package ManipulacioCadenasText;

import java.util.Locale;
import java.util.Scanner;

public class SumaLletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String Paraula = sc.nextLine();

        char A = Paraula.charAt(0);
        char B = Paraula.charAt(1);
        char C = Paraula.charAt(2);
        char D = Paraula.charAt(3);
        char E = Paraula.charAt(4);

        int Num = A+B+C+D+E;
        System.out.println(Num);


    }
}
