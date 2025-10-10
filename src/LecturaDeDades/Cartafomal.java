package LecturaDeDades;

import java.util.Scanner;

public class Cartafomal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tractament = sc.nextLine();
        String nom = sc.nextLine();
        String cognom1 = sc.nextLine();
        String cognom2 = sc.nextLine();

        System.out.print(tractament);
        System.out.print(" ");
        System.out.print(cognom1);
        System.out.print(" ");
        System.out.print(cognom2);
        System.out.print(", ");
        System.out.println(nom);
        System.out.println();
        System.out.println("El principal objectiu de la present carta...");
    }
}
