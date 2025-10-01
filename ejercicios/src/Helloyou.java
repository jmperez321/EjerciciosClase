import java.util.Locale;
import java.util.Scanner;

public class Helloyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        String nom1 = sc.nextLine();
        System.out.print("Hola ");
        System.out.print(nom1);
        System.out.println("!");
    }
}
