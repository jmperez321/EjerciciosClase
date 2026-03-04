package Exceptions;

import java.util.Locale;
import java.util.Scanner;

public class arrayIndexOutOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        try{

            int melon = sc.nextInt();
            int[] array = new int[melon];
            for (int i = 0; i < melon; i++) {
                array[i] = sc.nextInt();
            }
            int pos = sc.nextInt();
            System.out.println(array[pos]);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Aquesta posició no existeix dins l'array.");

        }
    }
}
