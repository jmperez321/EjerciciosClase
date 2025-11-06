package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class StreetFighter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String ESTAT = sc.next();
        String EVENT = sc.nextLine();
        // PROBAREMOS AQUI EL ELSE para todos los que no cambiar e impriman el estado actual.
        if (ESTAT.equals("IDLE")) {
            if (EVENT.equals("JOYSTICK_UP")) {
                System.out.println("JUMPING");
            } else if (EVENT.equals("JOYSTICK_LEFT/RIGHT")) {
                System.out.println("WALKING");
            } else if (EVENT.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (EVENT.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else {
                System.out.println("IDLE");
            }
        }
        if (ESTAT.equals("WALKING")) {
            if (EVENT.equals("JOYSTICK_UP")) {
                System.out.println("JUMPING");
            } else if (EVENT.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (EVENT.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else if (EVENT.equals("JOYSTICK_CENTER")) {
                System.out.println("IDLE");
            } else {
                System.out.println(ESTAT);
            }
        }

        // Lo siguiente me gustaria probar si puedo poner todos los equals en uno uniendolos con un OR





        /*if (ESTAT.equals("IDLE")) {
            if (EVENT.equals("JOYSTICK_UP")) {
                System.out.println("JUMPING");
            } else if (EVENT.equals("JOYSTICK_LEFT/RIGHT")) {
                System.out.println("WALKING");
            } else if (EVENT.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (EVENT.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else if (EVENT.equals("PUNCH_END")) {
                System.out.println(ESTAT);
            } else if (EVENT.equals("KICK_END")) {
                System.out.println(ESTAT);
            } else if (EVENT.equals("TOUCH_FLOOR")) {
                System.out.println(ESTAT);
            } else if (EVENT.equals("JOYSTICK_CENTER")) {
                System.out.println(ESTAT);
            }
        }*/
    }
}