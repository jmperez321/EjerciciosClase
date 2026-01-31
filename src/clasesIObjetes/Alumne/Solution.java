package clasesIObjetes.Alumne;

import java.util.Locale;
import java.util.Scanner;


// escriu el codi aqui
class Alumne {
    float[] notas;
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Alumne alumno = new Alumne();

        int numeroNotas = sc.nextInt();

        alumno.notas = new float[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {
            alumno.notas[i] = sc.nextFloat();
        }

        float suma = 0;
        for (int i = 0; i < numeroNotas; i++) {
            suma += alumno.notas[i];
        }

        System.out.println("Nota media: " + suma / numeroNotas);
    }
}
