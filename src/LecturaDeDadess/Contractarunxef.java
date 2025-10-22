package LecturaDeDadess;

import java.util.Locale;
import java.util.Scanner;

public class Contractarunxef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n1 = sc.nextLine();
        int n2 = sc.nextInt();
        sc.nextLine();
        String n3 = sc.nextLine();
        int n4 = sc.nextInt();
        sc.nextLine();
        String n5 = sc.nextLine();

        System.out.print("El formulari de ");
        System.out.print(n1);
        System.out.print(" s'ha completat. Et contactarem si necessitem un xef de cuina ");
        System.out.print(n5);
        System.out.println(".");
    }
}