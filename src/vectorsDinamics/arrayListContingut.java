package vectorsDinamics;
// NO ESTA TERMINADO ALGO ESTA MAL
// PETA EN EL CASO 4

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class arrayListContingut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<Integer> numeracio = new ArrayList<>();
        int num1;

        while (true) {
            num1 = sc.nextInt();
            if (num1 < 0) break;
            else {
                numeracio.add(num1);
            }
        }
        if (numeracio.size() == 2) {
            System.out.println("-1");
        } else {
            if ((numeracio.size()) % 2 == 0) {
                System.out.println(numeracio.get((numeracio.size() + 1) / 2) + 1);
            } else {
                System.out.println(numeracio.get(((numeracio.size()) + 2) / 2));
            }
        }

        /*if ((numeracio.size() - 1) % 2 == 0) {
            System.out.println(numeracio.get((numeracio.size()) / 2) + 1);
        } else {
            System.out.println(numeracio.get((numeracio.size()) / 2) + 1);
        }*/
    }
}
