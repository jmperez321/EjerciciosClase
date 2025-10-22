package ManipulacioCadenaText;

import java.util.Locale;
import java.util.Scanner;

public class kebabcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String cadena = sc.nextLine();
        String cadenaMayus = cadena.toLowerCase();

        String Cadena3 = cadenaMayus.replace(" ","-");
        System.out.println(Cadena3);

    }
}
