import java.util.Locale;
import java.util.Scanner;

public class rellotgedemanil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int SS = sc.nextInt();

        double gs = SS*6;
        double gm = MM*6+0.1*SS;
        double gh = HH*30+0.5*MM+(0.5/60)*SS;

        System.out.println(gh);
        System.out.println(gm);
        System.out.println(gs);
    }
}
