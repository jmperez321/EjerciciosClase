package Exceptions;

import java.util.Locale;
import java.util.Scanner;

public class arithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        try{
            int melon = sc.nextInt();
            System.out.println(10/melon);

        } catch (ArithmeticException ex){
            System.out.println("No es pot dividir entre zero!");

        }
    }
}
