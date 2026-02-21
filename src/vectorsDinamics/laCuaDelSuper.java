package vectorsDinamics;
// INCOMPLETO NO VALIDO
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
        }
        int cua = 0;
        int minActual = 0;
        int tempsAtencio = 0;
        int ultimMinutEntrada = 0;
        for (int i = 0; i < liada.size(); i++) {
            char c = liada.get(i);
            if (Character.isLetter(c)) {
                cua++;
                ultimMinutEntrada = minActual;
            } else if (c == '|') {
                minActual++;
                if (tempsAtencio > 0) {
                    tempsAtencio--;
                }
                if (tempsAtencio == 0 && cua > 0) {
                    cua--;
                    tempsAtencio = 2;
                }
                if (cua == 0 && tempsAtencio == 0 && minActual - ultimMinutEntrada >= 5) {
                    System.out.println(minActual + 1);
                    return;
                }
            }
        }
    }
}
