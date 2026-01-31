package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class saludaendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String A = sc.nextLine();

        if (A.equals("French")) {
            System.out.println("Bonjour");
        } else if (A.equals("Spanish")) {
            System.out.println("Hola");
        } else if (A.equals("Russian")) {
            System.out.println("Zdravstvuyte");
        } else if (A.equals("Chinese")) {
            System.out.println("Nin hao");
        } else if (A.equals("Japanese")) {
            System.out.println("Konnichiwa");
        } else if (A.equals("German")) {
            System.out.println("Guten Tag");
        } else if (A.equals("Portuguese")) {
            System.out.println("Ola");
        } else if (A.equals("Arabic")) {
            System.out.println("Asalaam alaikum");
        } else if (A.equals("Hindi")) {
            System.out.println("Namaste");
        } else if (A.equals("Romanian")) {
            System.out.println("Buna ziua");
        } else {
            System.out.println("No conec el teu idioma, com es diu hola?");
            String B = sc.nextLine();
            System.out.println(B);
        }
    }
}
