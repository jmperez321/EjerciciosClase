import java.util.Scanner;

public class comptantel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // horas reloj
        int M = sc.nextInt(); // minuts reloj

        int H2 = (24-H)*60;
        int M2 = 60-M;
        int R = H2+M2-60;

        System.out.println(R);

    }
}
