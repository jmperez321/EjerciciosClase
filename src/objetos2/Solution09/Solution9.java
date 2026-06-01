package objetos2.Solution09;

import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GearBox gearBox = new GearBox();
        gearBox.numGears = sc.nextInt();
        sc.nextLine();

        String action;
        while (!(action = sc.nextLine()).equals("__END__")) {
            switch (action) {
                case "UP":
                    gearBox.gearUp();
                    break;
                case "DOWN":
                    gearBox.gearDown();
                    break;
            }
            gearBox.show();
        }
    }
}
