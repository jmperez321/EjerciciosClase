package vectorsDinamics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class laCuaDelSuper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        List<Character> liada = new ArrayList<>();
        String lecturaCompleta = sc.nextLine();
        for (int i = 0; i < lecturaCompleta.length(); i++) {
            liada.add(lecturaCompleta.charAt(i));
            liada.stream().filter(x != " ");
        }
        /*do {
            ponts = sc.nextFloat();
            if (ponts < 0) {
                break;
            }
            liada.add(ponts);
        } while (ponts > 0);
        float alturaVehicle = sc.nextFloat();*/
        System.out.println(liada);
        
    }
}
