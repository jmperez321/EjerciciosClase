package objetos2.Solution23;

import java.util.Scanner;

class Producte {
    String nom;
    String descripcio;
    float preu;
    int stock;
}

public class Solution23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producte producte = new Producte();
        producte.nom = sc.nextLine();
        producte.descripcio = sc.nextLine();
        producte.preu= sc.nextFloat();
        producte.stock=sc.nextInt();

        System.out.println("Nom:        " + producte.nom);
        System.out.println("Descripcio: " + producte.descripcio);
        System.out.println("Preu:       " + producte.preu);
        System.out.println("Stock:      " + producte.stock);
    }
}
