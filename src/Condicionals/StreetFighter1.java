package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class StreetFighter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String ESTAT = sc.next();
        String EVENT = sc.nextLine();
        EVENT= EVENT.trim( );
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
        } else if (ESTAT.equals("WALKING")) {
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
        } else if (ESTAT.equals("KICKING")) {
            if (EVENT.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else if (EVENT.equals("KICK_END")) {
                System.out.println("IDLE");
            } else {
                System.out.println(ESTAT);
            }
        } else if (ESTAT.equals("PUNCHING")) {
            if (EVENT.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (EVENT.equals("PUNCH_END")) {
                System.out.println("IDLE");
            } else {
                System.out.println(ESTAT);
            }
        } else if (ESTAT.equals("JUMPING")) {
            if (EVENT.equals("TOUCH_FLOOR")) {
                System.out.println("IDLE");
            } else if (EVENT.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (EVENT.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else {
                System.out.println(ESTAT);
            }
        }
    }
}