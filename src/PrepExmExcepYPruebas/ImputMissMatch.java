package PrepExmExcepYPruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImputMissMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int N = sc.nextInt();
            System.out.println(N);
        }catch (InputMismatchException e){
            System.out.println("Cal introduïr un nombre enter!");
        }
    }
}