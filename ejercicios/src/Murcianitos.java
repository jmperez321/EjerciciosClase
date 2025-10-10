import java.util.Locale;
import java.util.Scanner;

public class Murcianitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int W1 = sc.nextInt();
        int H1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        int W2 = sc.nextInt();
        int H2 = sc.nextInt();

        boolean pum = !((X1 + W1 <= X2) || (X2 + W2 <= X1) || (Y1 + H1 <= Y2) || (Y2 + H2 <= Y1));
        System.out.println(pum);
    }
}