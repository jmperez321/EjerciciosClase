package hashMap.Falles;

import javax.swing.*;
import java.util.*;

public class ninots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            HashMap<String, Integer> catInfantil = new HashMap<>();
            HashMap<String, Integer> catAdults = new HashMap<>();

            for (int i = 0; i < num; i++) {
                String ninot = sc.next();

                if (ninot.equals(ninot.toLowerCase())) {
                    if (catInfantil.containsKey((ninot))) {
                        int vots = catInfantil.get(ninot);
                        vots++;
                        catInfantil.put(ninot, vots);
                    } else {
                        catInfantil.put(ninot, 1);
                    }
                } else {
                    if (catAdults.containsKey((ninot))) {
                        int vots = catAdults.get(ninot);
                        vots++;
                        catAdults.put(ninot, vots);
                    } else {
                        catAdults.put(ninot, 1);
                    }
                }
            }
            String guanyadorInfantil = calculaGuanyador(catInfantil);
            String guanyadorAdult = calculaGuanyador(catAdults).toUpperCase();
            System.out.println(guanyadorInfantil+ " "+ guanyadorAdult);
        }

    }

    public static String calculaGuanyador(HashMap<String, Integer> votacio) {
        int maxVots = -1;
        String guanyador = null;
        boolean empat = false;
        for (Map.Entry<String, Integer> votsNinot : votacio.entrySet()) {
            if (votsNinot.getValue() > maxVots) {
                maxVots = votsNinot.getValue();
                guanyador = votsNinot.getKey();
                empat = false;
            } else if (votsNinot.getValue() == maxVots) {
                empat = true;
            }

        }
        return empat ? "empate" : guanyador;
    }
}
