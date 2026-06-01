package objetos2.Solution13;

import java.util.Scanner;

public class Solution13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Thermometer thermometer1 = new Thermometer();
        Thermometer thermometer2 = new Thermometer();

        while (sc.hasNextFloat()) {
            float a = sc.nextFloat();

            if (a < -273.1f) {
                break;
            }

            thermometer1.celsius = a;

            if (sc.hasNextFloat()) {
                thermometer2.celsius = sc.nextFloat();
            }

            System.out.println("Termometre 1");
            thermometer1.printCelsius();
            thermometer1.printFahrenheit();
            thermometer1.printKelvin();

            System.out.println("Termometre 2");
            thermometer2.printCelsius();
            thermometer2.printFahrenheit();
            thermometer2.printKelvin();

            System.out.println("--------");
        }
    }
}
