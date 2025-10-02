import java.util.Locale;
import java.util.Scanner;

public class Piramides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int T = (H*(H+1))/2;
        int C = 3*T;

        System.out.println(C);
    }
}