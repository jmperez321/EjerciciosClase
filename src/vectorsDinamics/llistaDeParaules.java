package vectorsDinamics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class llistaDeParaules {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<String> paraules = new ArrayList<>();
        String para = "";

        while (true) {
            para = sc.nextLine();
            if (para.equals("END")) break;
            else {
                paraules.add(para);
            }
        }

        paraules.sort(null);
        for (String word : paraules) {
            System.out.println(word);
        }
    }
}
