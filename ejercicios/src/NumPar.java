import java.util.Locale;
import java.util.Scanner;

public class NumPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Ax = A % 2;
        int Bx = B % 2;
        int Cx = C % 2;


        Boolean RES = Ax || Bx || Cx;

        System.out.println(RES);


    }
}