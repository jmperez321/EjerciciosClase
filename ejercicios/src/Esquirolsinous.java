import java.util.Locale;
import java.util.Scanner;

public class Esquirolsinous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int E = sc.nextInt();
        int N = sc.nextInt();

        int R = (N%E);

        System.out.println(R);
    }
}