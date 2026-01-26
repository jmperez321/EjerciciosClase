package clasesIObjetes.GosiGat;

class Gat {
    public void miolar() {
        System.out.println("Miau, miau");
    }
}

class Gos {
    public void lladrar() {
        System.out.println("Guau, guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Gos gos = new Gos();
        Gat gat = new Gat();

        gos.lladrar();
        gat.miolar();
    }
}
