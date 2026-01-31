package bucles;

import java.util.Locale;
import java.util.Scanner;

public class MaquinaDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        int Stock = sc.nextInt();
        float Price = sc.nextFloat();
        float Balance = 0;
        sc.nextLine();
        String Status = sc.next();
        System.out.println("Insert coin");
        while (!Status.equals("OFF")) {
            if (Status.equals("INSERT")) {
                float Money = sc.nextFloat();
                Balance = Balance + Money;
                sc.nextLine();
                if (Balance == 0) {
                    System.out.println("Insert coin");
                } else {
                    System.out.println("Balance:" + Balance);
                }
            }
            if (Status.equals("EXPEND")) {
                if (Stock > 0) {
                    if (Balance >= Price) {
                        Stock--;
                        Balance -= Price;
                        System.out.println("Your water, thanks");
                        if (Balance == 0) {
                            System.out.println("Insert coin");
                        } else {
                            System.out.println("Balance:" + Balance);
                        }
                    } else {
                        System.out.println("Price:" + Price);
                        if (Balance == 0) {
                            System.out.println("Insert coin");
                        } else {
                            System.out.println("Balance:" + Balance);
                        }
                    }
                } else {
                    System.out.println("Product unavailable");
                    if (Balance == 0) {
                        System.out.println("Insert coin");
                    } else {
                        System.out.println("Balance:" + Balance);
                    }
                }
            }
            if (Status.equals("REFUND")) {
                System.out.println("Refund:" + Balance);
                Balance = 0;
                if (Balance == 0) {
                    System.out.println("Insert coin");
                } else {
                    System.out.println("Balance:" + Balance);
                }
            }
            Status = sc.next();
        }
    }
}