package ExceptionsProp;

import java.util.Locale;
import java.util.Scanner;

public class dividedbyzeroexcept {

    public static void main(String[] args) throws DividedByZeroException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int input = sc.nextInt();
        int numerador = 10;

        try {
            int divisio = numerador / input;
            System.out.println(divisio);
        } catch (ArithmeticException e) {
            if (e.getMessage().contains("/ by zero")){
                throw new DividedByZeroException();
            }

        }
    }

}

class DividedByZeroException extends Exception {

}

