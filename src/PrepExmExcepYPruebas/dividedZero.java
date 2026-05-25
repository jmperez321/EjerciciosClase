package PrepExmExcepYPruebas;

import java.util.Locale;
import java.util.Scanner;

public class dividedZero {
    static void main(String[] args) throws dZero {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int num = sc.nextInt();
        System.out.println(devolver(num));
    }

    static int devolver(int num) throws dZero {
        try {
            return 10 / num;
        } catch (Exception e) {
            throw new dZero("No es pot dividir entre zero!");
        }
    }

}
