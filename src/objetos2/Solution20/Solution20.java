package objetos2.Solution20;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Producto {
    String descripcion;
    float precio;

    Producto(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Descuento {
    float valor;

    Descuento(float valor) {
        this.valor = valor;
    }

    public void aplicar(Producto producto) {
        producto.precio *= (100-valor)/100;
    }

}

public class Solution20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Producto producto = new Producto(sc.next(), sc.nextFloat());

        System.out.println(producto);

        Descuento descuento = new Descuento(sc.nextFloat());

        descuento.aplicar(producto);

        System.out.println(producto);
    }
}
