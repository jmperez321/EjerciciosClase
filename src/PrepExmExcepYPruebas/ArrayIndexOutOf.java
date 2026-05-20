package PrepExmExcepYPruebas;

import java.util.Scanner;

public class ArrayIndexOutOf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        try {
            System.out.println(array[sc.nextInt()]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Aquesta posició no existeix dins l'array.");
        }

    }
}
