package clasesIObjetes.Triangle;

import java.util.Locale;
import java.util.Scanner;

class Triangle {
    float base, height;

    float calculateArea() {
        return (base * height) / 2;
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.base = sc.nextFloat();
        t1.height = sc.nextFloat();

        System.out.format("Area triangle1: %.2f%n", t1.calculateArea());

        t2.base = sc.nextFloat();
        t2.height = sc.nextFloat();

        System.out.format("Area triangle2: %.2f%n", t2.calculateArea());
    }
}
