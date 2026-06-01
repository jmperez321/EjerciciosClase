package objetos2.Solution11;

import java.util.*;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Race race = new Race();
        try {
            int numBikes = sc.nextInt();

            race.bikes = new Bike[numBikes];

            for (int i = 0; i < numBikes; i++) {
                race.bikes[i] = new Bike(sc.nextInt());
            }
            Bike fastest = race.fastest();
            System.out.println(fastest == null ? "No bikes" : fastest.speed);
        } catch (InputMismatchException e) {
            System.out.println("El valor ha de ser un numero");
        } catch (NoNegativException e){
            System.out.println(e.getMessage());
        }

    }
}
