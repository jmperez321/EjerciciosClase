package objetos2.Solution11;

public class Bike {
    int speed;
    public Bike(int speed) {
        if (speed<0){
            throw new NoNegativException("El numero no puede ser negativo.");
        }
        this.speed = speed;
    }
}
