import java.util.Locale;
import java.util.Scanner;

public class artropodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int I = sc.nextInt();
        int A = sc.nextInt();
        int C = sc.nextInt();
        int M1 = sc.nextInt();
        int S1 = sc.nextInt();
        int M2 = sc.nextInt();
        int S2 = sc.nextInt();

        int potes = (I*6)+(A*8)+(C*10)+(M1*S1*2)+(M2*S2*4);
        System.out.println(potes);

    }
}