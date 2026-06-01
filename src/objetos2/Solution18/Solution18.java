package objetos2.Solution18;

import java.util.Locale;
import java.util.Scanner;

// escriu el codi aqui
class Libro{

    public String ISBN ;
    public Autor autor;
    public String titulo;
    public float rating;
}

class Autor{

    public String nombre;
    public float rating;
}


public class Solution18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Libro libro = new Libro();

        libro.autor = new Autor();

        libro.titulo = sc.nextLine();
        libro.ISBN = sc.nextLine();
        libro.rating = sc.nextFloat();
        sc.nextLine();
        libro.autor.nombre = sc.nextLine();
        libro.autor.rating = sc.nextFloat();

        System.out.println(libro.ISBN);
        System.out.println(libro.titulo);
        System.out.println(new String(new char[(int)libro.rating]).replace("\0","*"));
        System.out.println(libro.autor.nombre);
        System.out.println(new String(new char[(int)libro.autor.rating]).replace("\0","*"));

    }
}
