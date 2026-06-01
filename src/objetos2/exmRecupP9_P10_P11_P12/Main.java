package objetos2.exmRecupP9_P10_P11_P12;

public class Main {
    public static void main(String[] args) {
        try {
            Calculadora c = new Calculadora();
            c.afegir(new Operand('+', 1));
            c.afegir(new Operand('*', 2));
            c.afegir(new Operand('=', 3));
            c.afegir(new Operand('/', 9));
            System.out.println(c.calcular());
        }catch (DividedByZeroException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Excepcion Generica");
        }
    }
}
