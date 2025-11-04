package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class LletresScr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String C = sc.nextLine();

        if (C.equals("K")){
            System.out.println("5");
        } else if (C.equals("Q") || C.equals("Z")){
            System.out.println("10");
        } else if (C.equals("D")||C.equals("G")){
            System.out.println("2");
        } else if (C.equals("J")||C.equals("X")) {
            System.out.println("8");
        }else if (C.equals("F")||C.equals("H")||C.equals("V")||C.equals("W")||C.equals("Y")) {
            System.out.println("4");
        }else if (C.equals("B")||C.equals("C")||C.equals("M")||C.equals("P")) {
            System.out.println("3");
        }else {
            System.out.println("1");
        }

    }
}