package Exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class inputMissMatchExcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        try{
            int melon = sc.nextInt();
            System.out.println(melon);
        } catch (InputMismatchException ex){
            System.out.println("Cal introduïr un nombre enter!");

        }
    }
}
