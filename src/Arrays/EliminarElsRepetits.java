package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class EliminarElsRepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numElement = sc.nextInt();
        String[] element = new String[numElement];
        for (int i = 0; i < numElement; i++) {
            element[i] = sc.next();
        }
        String[] elementSinDupes = new String[numElement];

        for (int i = 0; i < element.length; i++) {
            boolean existe = false;
            for (int j = 0; j < elementSinDupes.length; j++) {
                if (element[i].equals(elementSinDupes[j])) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                elementSinDupes[i] = element[i];
            }
        }
        for (String melon : elementSinDupes) {
            if (melon != null) {
                System.out.print(melon + " ");
            }
        }
    }
}
