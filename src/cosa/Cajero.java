package cosa;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int saldoBancario = 1000;
        boolean luz = true;
        while (luz) {
            System.out.println("""
                    ----------------
                    Elige una opcion:
                    1. Consultar.
                    2. Retirar.
                    3. Ingresar.
                    4. Salir.
                    ----------------""");
            int op = sc.nextInt();
            try {
                if (op == 1) {
                    System.out.println("""
                            ----------------
                            Saldo actual es: """ + saldoBancario);
                } else if (op == 2) {
                    System.out.println("Cuanto quieres retirar?");
                    int retirada = sc.nextInt();
                    if (retirada < 1) {
                        throw new RetiradaInvalidaExcep("Error: La Retirada no puede ser inferior a 1");
                    }
                    if (retirada > saldoBancario) {
                        throw new SaldoInsufException("Error: No tienes suficiente saldo");
                    }
                    saldoBancario -= retirada;
                    System.out.println("""
                            ----------------
                            Saldo actual es: """ + saldoBancario);
                } else if (op == 3) {
                    System.out.println("Cuanto quieres ingresar?");
                    int ingreso = sc.nextInt();
                    if (ingreso < 1) {
                        throw new RetiradaInvalidaExcep("Error: El Ingreso no peude ser inferior a 1");
                    }
                    saldoBancario += ingreso;
                    System.out.println("""
                            ----------------
                            Saldo actual es: """ + saldoBancario);
                } else if (op == 4) {
                    luz = false;
                }
            } catch (RetiradaInvalidaExcep e) {
                System.out.println(e.getMessage());
            } catch (SaldoInsufException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
