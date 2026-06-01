package objetos2.Solution05;

import java.util.Scanner;

class LineSeparator {
    int size;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LineSeparator lineSeparator = new LineSeparator();
        while((lineSeparator.size = scanner.nextInt()) != -1){
            System.out.format("Aqui sota hi surt una line de %d guions%n", lineSeparator.size);
            lineSeparator.print();
        }
    }
}
