import java.util.Locale;
import java.util.Scanner;

public class NumSENAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Boolean Ax = (A % 2) >0;
        Boolean Bx = (B % 2) >0;
        Boolean Cx = (C % 2) >0;

        Boolean RES = (Ax && Bx && Cx)||(!Ax && !Bx && !Cx);
        System.out.println(RES);

    }
}