package PrepExmExcepYPruebas;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticException {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int num = sc.nextInt();
        System.out.println(devolver(num));
    }

    static int devolver(int num) {
        try {
            return 10 / num;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("No es pot dividir entre zero!");
            throw e;
        }
    }
}
