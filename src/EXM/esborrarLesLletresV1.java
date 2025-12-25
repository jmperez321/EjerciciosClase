package EXM;

import java.util.Locale;
import java.util.Scanner;

public class esborrarLesLletresV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numParau = sc.nextInt();
        String[] paraula = new String[numParau];
        for (int i = 0; i < numParau; i++) {
            paraula[i] = sc.next();
        }

        int numNum = sc.nextInt();
        int[] corte = new int[numNum];
        for (int i = 0; i < numNum; i++) {
            corte[i] = sc.nextInt();
        }

        for (int i = 0; i < paraula.length; i++) {
            if (i < corte.length) {
                int robo = corte[i];
                if (robo >= 0 && robo < paraula[i].length()) {
                    paraula[i] = paraula[i].substring(0, robo) + paraula[i].substring(robo + 1);
                }
            }
        }

        for (int i = 0; i < paraula.length; i++) {
            System.out.print(paraula[i] + " ");
        }
    }
}

