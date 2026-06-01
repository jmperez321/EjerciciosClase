package objetos2.exmRecupP9_P10_P11_P12;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Operand> lista=new ArrayList<>();

    public void afegir(Operand nou){
        lista.add(nou);
    }

    public float calcular() {
        float acum = 0;
        for (Operand op : lista) {
            switch (op.getOperador()) {
                case '+' -> acum += op.getValor();
                case '-' -> acum -= op.getValor();
                case '*' -> acum *= op.getValor();
                case '/' -> {
                    if(op.getValor()==0){
                        throw new DividedByZeroException("Error: división por cero.");
                    }
                    acum /= op.getValor();

                }
            }
        }
        return acum;

    }
}
