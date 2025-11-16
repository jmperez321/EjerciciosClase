package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class MaquinaDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String Status = "";
        int Stock = sc.nextInt();
        float PreuAmp = sc.nextFloat();
        float Balance = 0;
        sc.nextLine();
        String Ope = sc.nextLine();

        while (!Status.equals("OFF")){
            String Ope = sc.nextLine();
            if (Balance==0) {
                System.out.println("Balance:"+Balance);
            } else {
                System.out.println("Insert coin");
            }



        }



    }
}