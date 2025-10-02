import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int comensals = sc.nextInt();   // Cantidad de comensales
        float parros = sc.nextFloat();  // Precio/Kg (1pers=0,125kg)
        float pgambes = sc.nextFloat(); // Precio/Kg (1pers=0,0625kg)

        double rqarros = (comensals*0.125);
        double rqgambes = (comensals*0.0625);
        double arros = (rqarros*parros);
        double gambes = (rqgambes*pgambes);
        double resto = (gambes+arros);

        System.out.println(rqarros + " kg arros");
        System.out.println(rqgambes + " kg gambes");
        System.out.println(arros + " euros arros");
        System.out.println(gambes + " euros gambes");
        System.out.println("TOTAL: " + resto + " euros");

    }
}