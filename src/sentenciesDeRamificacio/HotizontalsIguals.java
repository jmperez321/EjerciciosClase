package sentenciesDeRamificacio;

import java.util.Locale;
import java.util.Scanner;

public class HotizontalsIguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int colum = sc.nextInt();
        int FilaEncontrada = -1;
        for (int i = 0; i < filas; i++) {
            int primero = sc.nextInt();
            boolean todosiguales = true;
            for (int j = 1; j < colum; j++) {
                int num = sc.nextInt();
                if (num != primero) {
                    todosiguales = false;
                }
            }
            if (todosiguales && FilaEncontrada == -1) {
                FilaEncontrada = i;
            }
        }
        if (FilaEncontrada != -1) {
            System.out.println("La fila " + FilaEncontrada + " té tots els números iguals.");
        } else {
            System.out.println("No hi ha cap fila amb els números iguals.");
        }
    }
}