package vectorsDinamics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class arrayListAfegirV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<Integer> numeracio = new ArrayList<>();
        int num1;
        int num2;

        while (true) {
            num1 = sc.nextInt();
            if (num1 < 0) break;
            else {
                num2 = sc.nextInt();
                if (num2 >= 0) {
                    numeracio.addLast(num1);
                } else {
                    numeracio.addFirst(num1);
                }
            }
        }
        for (int numerito : numeracio) {
            System.out.print(numerito + " ");
        }

    }
}
