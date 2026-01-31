package condicionals;

import java.util.Locale;
import java.util.Scanner;

public class Xocolata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int Q = sc.nextInt();

        if (Q <= (W * H) && ((Q % W == 0) || (Q % H == 0))) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}