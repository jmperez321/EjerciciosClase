package interficies.aprovaono;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        MP mp=new MP();
        mp.afegirUF(new UF(sc.nextInt(),sc.nextInt(), sc.nextInt()));
        mp.afegirUF(new UF(sc.nextInt(),sc.nextInt(), sc.nextInt()));
        mp.afegirUF(new UF(sc.nextInt(),sc.nextInt(), sc.nextInt()));

    }
}

