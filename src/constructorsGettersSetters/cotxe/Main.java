package constructorsGettersSetters.cotxe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;


class Car {
    String model;
    int topSpeed;
    float acceleration;
    float braking;
    float cornering;

    // escriu el codi aqui

    public Car(String model, int topSpeed, float acceleration, float braking, float cornering) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.braking = braking;
        this.cornering = cornering;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numCars = sc.nextInt();
        sc.nextLine();

        Car[] cars = new Car[numCars];

        for (int i = 0; i < numCars; i++) {
            cars[i] = new Car(sc.nextLine(), sc.nextInt(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            sc.nextLine();
        }

        Arrays.sort(cars, Comparator.comparingInt(a -> -a.topSpeed));
        for (int i = 0; i < numCars; i++) {
            System.out.format("%-20s  %4d  %4.2f  %4.2f  %4.2f %n", cars[i].model, cars[i].topSpeed, cars[i].acceleration, cars[i].braking, cars[i].cornering);
        }
    }
}
