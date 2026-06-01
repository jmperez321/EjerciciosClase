package objetos2.Solution11;

public class Race {
    Bike[] bikes;

    public Bike fastest() {
        if (bikes.length == 0) {
            return null;
        } else {
            int max = bikes[0].speed;
            int pos = 0;
            for (int i = 0; i < bikes.length; i++) {
                if (bikes[i].speed > max) {
                    max = bikes[i].speed;
                    pos = i;
                }
            }
            return bikes[pos];
        }
    }
}
