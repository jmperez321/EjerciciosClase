import java.util.Locale;
import java.util.Scanner;

public class notamitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();

        float mitja = (N1+N2+N3)/3;
        System.out.println(mitja);

    }
}