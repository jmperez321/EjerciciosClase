package vectorsDinamics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class galibv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float ponts;
        List<Float> liada = new ArrayList<>();
        int pos = -1;
        do {
            ponts = sc.nextFloat();
            if (ponts < 0) {
                break;
            }
            liada.add(ponts);
        } while (ponts > 0);
        float alturaVehicle = sc.nextFloat();
        for (int i = 0; i < liada.size(); i++) {
            if (liada.get(i) < alturaVehicle) {
                pos = i + 1;
                System.out.println("xoca amb el pont " + pos);
                break;
            }
        }
        
    }
}
