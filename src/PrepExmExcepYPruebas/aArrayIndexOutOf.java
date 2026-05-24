package PrepExmExcepYPruebas;

import java.util.Scanner;

public class aArrayIndexOutOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        try {
            int pos = sc.nextInt();
            System.out.println(resultado(array, pos));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Aquesta posició no existeix dins l'array.");
        }

    }
    public static int resultado(int[] array, int pos){
        return array[pos];
    }
}
