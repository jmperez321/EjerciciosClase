package clasesIObjetes.P2;

class Operacions {
    private boolean disabled;

    public void incrementar(int x, int inc) {
        x += inc;
    }
}


public class act9_1 {
    public static void main(String[] args) {
        int e = 5;
        e--;
        System.out.println(e);


        Operacions ops = new Operacions();
        ops.incrementar(e, 3);
        System.out.println(e);
    }
}
