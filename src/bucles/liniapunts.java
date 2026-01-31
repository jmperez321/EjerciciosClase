package bucles;

import java.util.Locale;
import java.util.Scanner;

public class liniapunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int PuntsUser = sc.nextInt();
        for (int PuntsPintats = 0; PuntsPintats < PuntsUser; PuntsPintats++) {
            System.out.print(".");
        }
    }
}
