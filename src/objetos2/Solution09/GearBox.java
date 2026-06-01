package objetos2.Solution09;

public class GearBox {
    int gear;
    int numGears;

    void show() {
        System.out.print("Current gear: ");

        switch (gear) {
            case -1:
                System.out.println("R");
                break;
            case 0:
                System.out.println("N");
                break;
            default:
                System.out.println(gear);
        }
    }

    public void gearUp() {
        if (gear != numGears) {
            gear++;
        }

    }

    public void gearDown() {
        if (gear != -1) {
            gear--;
        }

    }
}
