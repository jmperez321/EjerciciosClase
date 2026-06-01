package objetos2.Solution08;

import java.util.*;


public class Solution8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LedArray ledArray = new LedArray(5);

        int position;
        try {
            while ((position = sc.nextInt()) != -1) {
                ledArray.switchLed(position);

                ledArray.draw();
                System.out.println();
            }
        }catch (NoNegativException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un numero del (0-4)");
        }
    }
}