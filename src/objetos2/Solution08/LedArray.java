package objetos2.Solution08;

public class LedArray {
    OLed[] leds;

    LedArray(int size){
        leds = new OLed[size];
        for (int i = 0; i < size; i++) {
            leds[i] = new OLed();
        }
    }

    void draw(){
        for(OLed led : leds){
            led.draw();
        }
    }

    public void switchLed(int position) {
        if (position<-1){
            throw new NoNegativException("Numero de led no valido. Por favor, Escoge una posición valida (0-4)");
        }
        if(leds[position].state==true){
            leds[position].switchOff();
        } else {
            leds[position].switchOn();
        }
    }
}
