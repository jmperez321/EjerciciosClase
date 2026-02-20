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
        lecturaCompleta=lecturaCompleta.replace(" ", "");
        for (int i = 0; i < lecturaCompleta.length(); i++){
            liada.add(lecturaCompleta.charAt(i));
        }
        int contMin = 0;
        int contBarras=0;
        for (int i = 0; i < liada.size(); i++) {
            if (liada.get(i)=='|'){
                contMin--;
                contBarras++;

            } else {
                contBarras = 0;
                contMin++;
                contMin++;

            }
            if (contBarras==5){
                System.out.println(i-1);
                break;
            }
        }

    }
}
