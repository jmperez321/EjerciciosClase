import java.util.Locale;
import java.util.Scanner;

public class Llumsapagats {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Boolean A = sc.nextBoolean();
        Boolean B = sc.nextBoolean();
        Boolean C = sc.nextBoolean();
        Boolean D = sc.nextBoolean();
        Boolean X = false;

        Boolean R = !A && !B && !C && !D;

        System.out.println(R);
    }
}
