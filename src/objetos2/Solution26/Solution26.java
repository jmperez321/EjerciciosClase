package objetos2.Solution26;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Casella {
    char lletra;

    public Casella(char lletra) {
        this.lletra = lletra;
    }
}

class Columna {
    Casella casella;

    public Columna(Casella casella) {
        this.casella = casella;
    }
}

class Fila {
    Columna[] columnes;

    Fila(int nColumnes, char lletra) {
        this.columnes = new Columna[nColumnes];
        for (int i = 0; i < nColumnes; i++) {
            this.columnes[i] = new Columna(new Casella(lletra));

        }
    }
}

class Taula {
    Fila[] files;

    Taula(int nFiles, int nColumnes, char lletra) {
        this.files = new Fila[nFiles];
        for (int i = 0; i < nFiles; i++) {
            for (int j = 0; j < nColumnes; j++) {
                this.files[i] = new Fila(nColumnes, lletra);
            }
        }
    }
}


public class Solution26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Taula taula = new Taula(scanner.nextInt(), scanner.nextInt(), scanner.next().charAt(0));

        for (int i = 0; i < taula.files.length; i++) {
            for (int j = 0; j < taula.files[i].columnes.length; j++) {
                System.out.print(taula.files[i].columnes[j].casella.lletra);
            }
            System.out.println();
        }
    }
}
