package bucles;

import java.util.Locale;
import java.util.Scanner;

public class Eslalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String PC = sc.nextLine();
        int Cont = 1;

        while (!PC.equals("META")) {
            System.out.println(PC + " " + Cont);
            PC = sc.nextLine();
            Cont++;
        }


    }
}

