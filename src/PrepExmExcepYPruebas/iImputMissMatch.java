package PrepExmExcepYPruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class iImputMissMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int N = leer(sc);
            System.out.println(num(N));
        } catch (InputMismatchException e) {
            System.out.println("Cal introduïr un nombre enter!");
        }
    }

    public static int num(int N){
        return N;
    }

    public static int leer(Scanner sc){
        return sc.nextInt();
    }
}