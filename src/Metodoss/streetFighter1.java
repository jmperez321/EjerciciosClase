package Metodoss;

import java.util.Locale;
import java.util.Scanner;

public class streetFighter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String estat = sc.next();
        String event = sc.nextLine().trim();

        estat = calcularNouEstat(estat, event);

        System.out.println(estat);
    }

    public static String procesarIdle(String event) {
        if (event.equals("JOYSTICK_UP")) return "JUMPING";
        if (event.equals("JOYSTICK_LEFT/RIGHT")) return "WALKING";
        if (event.equals("PUNCH_KEY")) return "PUNCHING";
        if (event.equals("KICK_KEY")) return "KICKING";
        return "IDLE";
    }

    public static String procesarWalking(String event) {
        if (event.equals("JOYSTICK_UP")) return "JUMPING";
        if (event.equals("PUNCH_KEY")) return "PUNCHING";
        if (event.equals("KICK_KEY")) return "KICKING";
        if (event.equals("JOYSTICK_CENTER")) return "IDLE";
        return "WALKING";
    }

    public static String procesarKicking(String event) {
        if (event.equals("KICK_END")) return "IDLE";
        return "KICKING";
    }

    public static String procesarPunching(String event) {
        if (event.equals("PUNCH_END")) return "IDLE";
        return "PUNCHING";
    }

    public static String procesarJumping(String event) {
        if (event.equals("TOUCH_FLOOR")) return "IDLE";
        if (event.equals("PUNCH_KEY")) return "PUNCHING";
        if (event.equals("KICK_KEY")) return "KICKING";
        return "JUMPING";
    }

    public static String calcularNouEstat(String estat, String event) {
        if (estat.equals("IDLE")) return procesarIdle(event);
        if (estat.equals("WALKING")) return procesarWalking(event);
        if (estat.equals("KICKING")) return procesarKicking(event);
        if (estat.equals("PUNCHING")) return procesarPunching(event);
        if (estat.equals("JUMPING")) return procesarJumping(event);
        return estat;
    }
}





