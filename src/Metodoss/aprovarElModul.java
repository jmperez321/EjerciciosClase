package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class aprovarElModul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean aprovUF1 = aprovaUF1(sc.nextInt(), sc.nextInt(), sc.nextInt());
        boolean aprovUF2 = aprovaUF2(sc.nextInt(), sc.nextInt(), sc.nextInt());
        boolean aprovUF3 = aprovaUF3(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(aprovUF1 && aprovUF2 && aprovUF3);
    }

    public static boolean aprovaUF1(int pt, int pl, int ne) {
        boolean via1UF1 = (pl / (float) pt >= 0.75f) && ne >= 4;
        boolean via2UF1 = (pl / (float) pt >= 0.5f) && ne >= 5;
        boolean via3UF1 = ne >= 7;
        return (via1UF1 || via2UF1 || via3UF1);
    }

    public static boolean aprovaUF2(int pt, int pl, int ne) {
        boolean via1UF2 = (pl / (float) pt >= 0.75f) && ne >= 4;
        boolean via2UF2 = (pl == pt);
        boolean via3UF2 = (pl / (float) pt >= 0.5f) && ne >= 5;
        return (via1UF2 || via2UF2 || via3UF2);
    }

    public static boolean aprovaUF3(int pt, int pl, int ne) {
        return (pl == pt && ne >= 5);
    }

}

