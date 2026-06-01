package objetos2.Solution13;

public class Thermometer {

    public float celsius;

    public Thermometer() {
        this.celsius = celsius;
    }

    public void printCelsius() {
        System.out.printf("%6.2fC%n", celsius);
    }

    public void printFahrenheit() {
        float fahrenheit = (celsius * 1.8f) + 32f;
        System.out.printf("%6.2fF%n", fahrenheit);
    }
    public void printKelvin() {
        float kelvin = celsius + 273.15f;
        System.out.printf("%6.2fK%n", kelvin);
    }
}
