package objetos2.exmRecupP9_P10_P11_P12;

public class Operand {
    char operador;
    float valor;

    public Operand(char operador, float valor) {
        if (operador != '+' && operador != '-' && operador != '/' && operador != '*') {
            throw new InvalidOperandTypeException("Operador invalido");
        }
        this.operador = operador;
        this.valor = valor;
    }

    public char getOperador() {
        return operador;
    }

    public float getValor() {
        return valor;
    }
}
