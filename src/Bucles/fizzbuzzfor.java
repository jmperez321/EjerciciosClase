package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class fizzbuzzfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        for (int A = Num1;A>=Num2;A--){
            if (A%3==0 && A%5==0){
                System.out.println("FizzBuzz");
            } else if (A%3==0) {
                System.out.println("Fizz");
            } else if (A%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(A);
            }
        }
    }
}

