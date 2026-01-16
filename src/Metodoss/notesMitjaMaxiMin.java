package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class notesMitjaMaxiMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cantNum = sc.nextInt();
        sc.nextLine();

        String nomMax = "";
        String nomMin = "";
        float numMax = 0;
        float sub = 0;
        float numMin = 10;


        for (int i = 1; i <= cantNum; i++) {
            String nomAct = sc.next();
            float numAct = sc.nextFloat();
            sub = sub + numAct;
            if (numAct > numMax) {
                numMax = numAct;
                nomMax = nomAct;
            }
            if (numAct < numMin) {
                numMin = numAct;
                nomMin = nomAct;
            }

        }
        float mitjana = sub / cantNum;
        System.out.println("L'alumne amb major nota és el/la " + nomMax + " amb un " + numMax);
        System.out.println("L'alumne amb menor nota és el/la " + nomMin + " amb un " + numMin);
        System.out.println("La nota mitjana de la classe és de " + mitjana);

    }

    public static float checkMax(float numAct, String nomAct, float numMax, String nomMax) {
        if (numAct > numMax) {
            numMax = numAct;
            nomMax = checkNomMax(nomAct, nomMax);
        }
        return (numMax);
    }

    public static String checkNomMax(String nomMax, String nomAct) {
        nomMax = nomAct;
        return nomMax;
    }

    public static float checkMin(float numAct, String nomAct, float numMin, String nomMin) {
        if (numAct < numMin) {
            numMin = numAct;
            nomMin = checkNomMin(nomAct, nomMin);
        }
        return numMin;

    }

    public static String checkNomMin(String nomMin, String nomAct) {
        nomMin = nomAct;
        return nomMin;
    }

}