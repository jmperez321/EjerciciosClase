package castngsLiterals;

import java.util.Locale;
import java.util.Scanner;

public class NotacionAlgeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int C = sc.nextInt();
        C += 96;
        char L = (char) C;
        String F = sc.next();
        System.out.println(L + F);
    }
}