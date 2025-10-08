import java.util.Locale;
import java.util.Scanner;

public class DataCaduc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int D1 = sc.nextInt();
        int M1 = sc.nextInt();
        int A1 = sc.nextInt();
        int D2 = sc.nextInt();
        int M2 = sc.nextInt();
        int A2 = sc.nextInt();

        Boolean RES = (A1>A2) || (A2==A1 && M1>M2) || (A2==A1 && M1==M2 && D1>D2);
        System.out.println(!RES);
    }
}