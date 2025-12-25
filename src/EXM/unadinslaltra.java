package EXM;

import java.util.Locale;
import java.util.Scanner;

public class unadinslaltra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numParau = sc.nextInt();
        String[] paraula = new String[numParau];
        for (int i = 0; i < numParau; i++) {
            paraula[i] = sc.next();
        }

        int numNum = sc.nextInt();
        String[] silabas = new String[numNum];
        for (int i = 0; i < numNum; i++) {
            silabas[i] = sc.next();
        }

        for (int i = 0; i < paraula.length; i++) {
            System.out.print(paraula[i] + ": ");
            for (int j = 0; j < silabas.length; j++) {
                if (paraula[i].contains(silabas[j])) {
                    System.out.print(silabas[j] + " ");
                }
            }
            System.out.println();
        }
    }
}

