package objetos2.Solution15;

import java.util.Locale;
import java.util.Scanner;

class CreditCard{

    public String holderName;
    public long cardNumber;
    public float accountBalance;
    public float spendingLimit;

}

public class Solution15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        CreditCard creditCard = new CreditCard();

        creditCard.holderName = sc.nextLine();
        creditCard.cardNumber = sc.nextLong();
        creditCard.accountBalance = sc.nextFloat();
        creditCard.spendingLimit = sc.nextFloat();

        System.out.println(creditCard.holderName.toUpperCase());
        System.out.println(String.valueOf(creditCard.cardNumber).replaceAll(".{4}","$0 "));
        System.out.println("Saldo: " + creditCard.accountBalance);
        System.out.println("Limit: " + creditCard.spendingLimit);

    }
}