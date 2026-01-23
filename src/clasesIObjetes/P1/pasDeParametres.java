package clasesIObjetes.P1;

class Enter {
    public int valor;
}


class Operacions {
    private boolean disabled;

    public void incrementar(Enter x, int inc) {
        x.valor += inc;
    }
}


public class pasDeParametres {
    public static void main(String[] args) {
        Enter e = new Enter();
        e.valor = 5;
        e.valor--;
        System.out.println(e.valor);


        Operacions ops = new Operacions();
        ops.incrementar(e, 3);
        System.out.println(e.valor);
    }
}
