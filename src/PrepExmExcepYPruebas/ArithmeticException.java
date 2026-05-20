package PrepExmExcepYPruebas;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticException {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int num = sc.nextInt();
        try {
            System.out.println(10 / num);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("No es pot dividir entre zero!");
        }
    }
}
