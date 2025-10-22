package ComparadorLogics;

import java.util.Locale;
import java.util.Scanner;

public class Paraulesiguals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String A = sc.nextLine();
        String B = sc.nextLine();

        Boolean R = A.equals(B);
        System.out.println(R);
    }
}
