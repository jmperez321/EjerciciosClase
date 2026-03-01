package hashMap.Falles;

import javax.swing.*;
import java.util.*;

// nidea ni caso
class Ninot {
    String nom;
    int votos = 0;
}

public class ninots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String nombrecito;
        int num;
        while (true) {
            num = sc.nextInt();
            HashMap<String, Ninot> melon = new HashMap<>();
            if (num == 0) {
                break;
            } else {
                for (int i = 0; i < num; i++) {
                    nombrecito = sc.next();
                    for(String nana : melon){

                    }
                    if(nombrecito.equals(melon.get(i)melon.nom)) {
                        melon.get(nombrecito).votos++;
                    }else{

                        Ninot n = new Ninot();  // CREO NINOT N
                        n.nom = sc.next();      // Asigno el nombre del ninot
                        n.votos++;              // Sumo el la cantidad de veces que aparece
                        melon.put(n.nom, n);    // Guardo
                    }
                }
            }


        }


    }
}
